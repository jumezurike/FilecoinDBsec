package jpa;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceUnitInfo;

import jpa.HibernatePersistenceUnitInfo;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor;
import utils.Constants;
import utils.DB_TYPE;

public class JpaEntityManagerFactory {
    private String DB_URL = "jdbc:mysql://localhost:3306/mock3";
    private String DB_USER_NAME = "";
    private String DB_PASSWORD = "";
    private DB_TYPE db_type;
    private Class[] entityClasses;

    public JpaEntityManagerFactory(Class[] entityClasses) {
        this.entityClasses = entityClasses;
    }
    public JpaEntityManagerFactory(Class[] entityClasses, String DB_URL, String DB_USER_NAME, String DB_PASSWORD) {
        this.entityClasses = entityClasses;
        this.DB_URL = DB_URL;
        this.DB_USER_NAME = DB_USER_NAME;
        this.DB_PASSWORD = DB_PASSWORD;
    }

    public JpaEntityManagerFactory(Class[] entityClasses, String DB_URL, String DB_USER_NAME, String DB_PASSWORD, DB_TYPE db_type) {
        this.entityClasses = entityClasses;
        this.DB_URL = DB_URL;
        this.DB_USER_NAME = DB_USER_NAME;
        this.DB_PASSWORD = DB_PASSWORD;
        this.db_type = db_type;
    }

    public EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    protected EntityManagerFactory getEntityManagerFactory() {
        PersistenceUnitInfo persistenceUnitInfo = getPersistenceUnitInfo(
                getClass().getSimpleName());
        Map<String, Object> configuration = new HashMap<>();
        return new EntityManagerFactoryBuilderImpl(
                new PersistenceUnitInfoDescriptor(persistenceUnitInfo), configuration)
                .build();
    }

    protected HibernatePersistenceUnitInfo getPersistenceUnitInfo(String name) {
        return new HibernatePersistenceUnitInfo(name, getEntityClassNames(), getProperties());
    }


    protected List<String> getEntityClassNames() {
        return Arrays.asList(getEntities())
                .stream()
                .map(Class::getName)
                .collect(Collectors.toList());
    }

    protected Properties getProperties() {
        Properties properties = Constants.getDBProperties(db_type);
        properties.put("hibernate.connection.datasource", Constants.getDataSource(db_type, DB_URL, DB_USER_NAME, DB_PASSWORD));
        return properties;
    }

    protected Class[] getEntities() {
        return entityClasses;
    }
}
