package utils;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.h2.jdbcx.JdbcDataSource;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.util.Properties;

public class Constants {
    public static String generateRandomString(int length) {
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        while (length-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public static Properties getDBProperties(DB_TYPE type){
        switch (type){
            case SQLITE -> {
                Properties properties=new Properties();
                properties.setProperty("hibernate.connection.driver_class","org.sqlite.JDBC");
                properties.setProperty("hibernate.dialect","org.hibernate.dialect.SQLiteDialect");
                properties.put("hibernate.id.new_generator_mappings", false);
                properties.setProperty("hibernate.show_sql","true");
                //properties.setProperty("hbm2ddl.auto","update");
                return properties;
            }
            case MYSQL -> {
                Properties properties = new Properties();
                properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
                properties.put("hibernate.id.new_generator_mappings", false);
                properties.put("hibernate.jdbc.batch_size", 1000);
                properties.setProperty("hibernate.jdbc.use_get_generated_keys", "false");
                return properties;
            }
            case H2 -> {
                Properties properties = new Properties();
                properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
                properties.put("hibernate.id.new_generator_mappings", false);
                properties.setProperty("hibernate.hbm2ddl.auto","create");
                return properties;
            }
            default -> {
                return null;
            }
        }
    }

    public static DataSource getDataSource(DB_TYPE type, String DB_URL, String DB_USER_NAME, String DB_PASSWORD){
        switch (type){
            case SQLITE -> {
                SQLiteDataSource sqLiteDataSource = new SQLiteDataSource();
                sqLiteDataSource.setUrl(DB_URL);
                return sqLiteDataSource;
            }
            case MYSQL -> {
                MysqlDataSource mysqlDataSource = new MysqlDataSource();
                mysqlDataSource.setURL(DB_URL);
                mysqlDataSource.setUser(DB_USER_NAME);
                mysqlDataSource.setPassword(DB_PASSWORD);
                return mysqlDataSource;
            }
            case H2 -> {
                JdbcDataSource jdbcDataSource = new JdbcDataSource();
                jdbcDataSource.setURL(DB_URL);
                jdbcDataSource.setUser(DB_USER_NAME);
                jdbcDataSource.setPassword(DB_PASSWORD);
                return jdbcDataSource;
            }
        }
        return null;
    }

    public static Long getRandomInt() {
        return (long) (Math.random() * 1000000000);
    }
}
