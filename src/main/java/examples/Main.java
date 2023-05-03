package examples;

import com.lokdon.datashield.DataShield;
import jpa.JpaEntityManagerFactory;
import utils.DB_TYPE;
import utils.EncryptionLevel;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager= getJpaEntityManager();
        Demo demo=new Demo();
        demo.setName("John Doe");
        demo.setEmail("johnd2@gmail.com");
        entityManager.getTransaction().begin();
        entityManager.persist(demo);
        entityManager.getTransaction().commit();
        System.out.println("Demo saved successfully");
        Demo test=entityManager.find(Demo.class,1L);
        System.out.println("Demo name: "+test.getName());
        System.out.println("Demo email: "+test.getEmail());
        entityManager.close();

    }
    private static class EntityManagerHolder {
        private static final EntityManager ENTITY_MANAGER = new JpaEntityManagerFactory(
                new Class[]{Demo.class})
                .getEntityManager();
    }

    public static EntityManager getJpaEntityManager() {
        return EntityManagerHolder.ENTITY_MANAGER;
    }
}

