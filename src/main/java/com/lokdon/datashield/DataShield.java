package com.lokdon.datashield;

import examples.Demo;
import jpa.JpaEntityManagerFactory;
import lokdon.CipherControl;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import utils.EncryptionLevel;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class DataShield {
    private static DataShield instance;
    private String DB_URL;
    private String DB_USER_NAME;
    private String DB_PASSWORD;
    private EncryptionLevel encryptionLevel;
    private List<Class> classList;

    public EntityManager entityManager;
    public void destroy() {
        try{
            if(entityManager!=null){
                entityManager.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    private DataShield() {
        entityManager= getJpaEntityManager();
    }

    private DataShield(String DB_URL, String DB_USER_NAME, String DB_PASSWORD, List<Class> classList, EncryptionLevel encryptionLevel) {
        this.DB_URL = DB_URL;
        this.DB_USER_NAME = DB_USER_NAME;
        this.DB_PASSWORD = DB_PASSWORD;
        this.encryptionLevel = encryptionLevel;
        this.classList = classList;
        this.classList.add(Config.class);
        entityManager= getJpaEntityManager();
    }

    public void save(Object object){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Object getOne(long id){
        try{
            return entityManager.find(Demo.class,id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /***
     * This method is used to get the instance of DataShield
     * @param DB_URL The URL of the database eg. jdbc:mysql://localhost:3306/database_name
     * @param DB_USER_NAME The username of the database
     * @param DB_PASSWORD The password of the database
     * @param encryptionLevel The encryption level of the database eg. EncryptionLevel.SECRET
     * @param API_KEY Your API KEY for DataShield, you can get it from https://lokdon.com
     * @return DataShield instance
     */
    public static DataShield init(String DB_URL, String DB_USER_NAME, String DB_PASSWORD, List<Class> classList, EncryptionLevel encryptionLevel, String API_KEY) {
        //verify API KEY
        if(instance!=null){
            instance.destroy();
        }
        instance = new DataShield(DB_URL, DB_USER_NAME, DB_PASSWORD, classList, encryptionLevel);
        return instance;
    }
    /***
     * This method is used to get the instance of DataShield with default encryption level of EncryptionLevel.PRIVATE
     * @param DB_URL The URL of the database eg. jdbc:mysql://localhost:3306/database_name
     * @param DB_USER_NAME The username of the database
     * @param DB_PASSWORD The password of the database
     * @param API_KEY Your API KEY for DataShield, you can get it from https://lokdon.com
     * @return DataShield instance
     */
    public static DataShield init(String DB_URL, String DB_USER_NAME, String DB_PASSWORD, List<Class> classList, String API_KEY) {
        //verify API KEY

        if(instance!=null){
            instance.destroy();
        }

        instance = new DataShield(DB_URL, DB_USER_NAME, DB_PASSWORD, classList, EncryptionLevel.PRIVATE);
        return instance;
    }

    public static void setup(DataShield dataShield, String apiKey){
        try {
            String payload=CipherControl.getInstance().validateToken(Constants.UWA, apiKey);
            if(payload!=null) {
                JSONObject root = (JSONObject) new JSONParser().parse(payload);
                String instanceId = (String) root.get("instance_id");
                String version = (String) root.get("version");
                String clientId=(String) root.get("client_id");
                String plan=(String) root.get("plan");

                String instanceIdFromConfig=dataShield.entityManager.createQuery("select c.value from Config c where c.k=:key",String.class).setParameter("key",Constants.KEY_INSTANCE_ID).getSingleResult();
                if(instanceIdFromConfig==null) {
                    List<Config> configs = new ArrayList<>();
                    configs.add(new Config(Constants.KEY_INSTANCE_ID, instanceId));
                    configs.add(new Config(Constants.KEY_VERSION, version));
                    configs.add(new Config(Constants.KEY_CLIENT_ID, clientId));
                    configs.add(new Config(Constants.KEY_API_KEY, apiKey));
                    configs.add(new Config(Constants.KEY_PLAN, plan));
                    dataShield.entityManager.getTransaction().begin();
                    for (Config config : configs) {
                        dataShield.entityManager.persist(config);
                    }
                    dataShield.entityManager.getTransaction().commit();
                }else{

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private EntityManager getJpaEntityManager() {
        return new JpaEntityManagerFactory(
                classList.toArray(new Class[classList.size()]), DB_URL, DB_USER_NAME, DB_PASSWORD)
                .getEntityManager();
    }


}
