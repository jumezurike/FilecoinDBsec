import com.lokdon.datashield.DataShield;
import examples.Demo;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Constants;
import utils.DB_TYPE;
import utils.EncryptionLevel;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityTest extends TestCase {

    DataShield dataShield;


    @BeforeEach
    public void setUpClass() {
        List<Class> classList= new ArrayList<>();
        classList.add(Demo.class);
        //MYSQL:
        //SQLITE
        try {
            dataShield = DataShield.init("jdbc:mysql://localhost:3306/mock5", "root", "",classList, EncryptionLevel.PRIVATE, DB_TYPE.MYSQL,"LXNWAjo6HnEhAmkyKWYiEjkCDV8uDHtHGyRiIQAAHXkqCnYCNQIHCA==.LXBtcSIhLHA/LQQkIXxieCsKanYEBQFPNR1dJAkDPWUIEn9DOjkkcD40fgIQXTt5PTR2Zh8FAV4vAQY1Kn0CajkKakQ6OjxwIm9+OxJbIgwiDlNxJCsFWjUdaTMtAgwLLTZoAjUBGnA5E3kyKnR6figrYXA5AD1POiVFQiF6BXg0AWF2IisFbBQAVzI0Qx5cDRJLcDkFGVA1HlM1LEMCeQwSaXAheWVxJzRiHg==.xIjCvcSuw73Ei17DlcOPw7rDrsKzScSuwq3EiUMvw6M=");
            //dataShield=DataShield.init("jdbc:h2:mem:test;DATABASE_TO_UPPER=false;DB_CLOSE_DELAY=-1","root","",classList, EncryptionLevel.PRIVATE, DB_TYPE.H2,"LXNWAjo6HnEhAmkyKWYiEjkCDV8uDHtHGyRiIQAAHXkqCnYCNQIHCA==.LXBtcSIhLHA/LQQkIXxieCsKanYEBQFPNR1dJAkDPWUIEn9DOjkkcD40fgIQXTt5PTR2Zh8FAV4vAQY1Kn0CajkKakQ6OjxwIm9+OxJbIgwiDlNxJCsFWjUdaTMtAgwLLTZoAjUBGnA5E3kyKnR6figrYXA5AD1POiVFQiF6BXg0AWF2IisFbBQAVzI0Qx5cDRJLcDkFGVA1HlM1LEMCeQwSaXAheWVxJzRiHg==.xIjCvcSuw73Ei17DlcOPw7rDrsKzScSuwq3EiUMvw6M=");
        } catch (Exception e) {
            e.printStackTrace();
            fail("DataShield init failed");
        }
    }

    @Test
    public void demoEntityTest() {
        if(dataShield==null)
            fail("DataShield is null");
        Demo demo=new Demo();
        demo.setName("Robert");
        demo.setEmail("robert@gmail.com");
        dataShield.save(demo);
        assertNotEquals(0,demo.getId());
        Demo test=dataShield.entityManager.find(Demo.class,demo.getId());
        assertNotNull(test);
        assertEquals(demo.getName(),test.getName());
        assertEquals(demo.getEmail(),test.getEmail());
    }

    @Test
    public void demoEntityTest2() {
        if (dataShield == null)
            fail("DataShield is null");
        List<Demo> demos = dataShield.entityManager.createQuery("select d from Demo d", Demo.class).getResultList();
        assertNotNull(demos);
        assertTrue(demos.size() > 0);
        for (Demo demo : demos) {
            System.out.println("Demo id: " + demo.getId());
            System.out.println("Demo name: " + demo.getName());
            System.out.println("Demo email: " + demo.getEmail());
        }
    }
    @Test
    public void random10MWrite(){
        if (dataShield == null)
            fail("DataShield is null");
        List<Demo> demos = new ArrayList<>();
        for(int i=0;i<10000000;i++) {
            Demo demo = new Demo();
            String random= Constants.generateRandomString((int)((Math.random()*10)+5));
            demo.setName(random);
            demo.setEmail(random+"@gmail.com");
            demos.add(demo);
        }
        dataShield.saveAll(demos);
    }
    @Test
    public void random10kRead(){
        if (dataShield == null)
            fail("DataShield is null");
        List<Demo> demos = dataShield.entityManager.createQuery("select d from Demo d", Demo.class).getResultList();
        assertNotNull(demos);
        assertTrue(demos.size() > 0);
        for (Demo demo : demos) {
            System.out.println("Demo id: " + demo.getId());
            System.out.println("Demo name: " + demo.getName());
            System.out.println("Demo email: " + demo.getEmail());
        }
    }
}
