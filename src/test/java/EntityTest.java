import com.lokdon.datashield.DataShield;
import examples.Demo;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Constants;
import utils.EncryptionLevel;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityTest extends TestCase {

    DataShield dataShield;


    @BeforeEach
    public void setUpClass() {
        dataShield = DataShield.init("jdbc:mysql://localhost:3306/mock3", "root", "", EncryptionLevel.PRIVATE, "API_KEY");
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
        for(int i=0;i<10000000;i++) {
            Demo demo = new Demo();
            String random= Constants.generateRandomString((int)((Math.random()*10)+5));
            demo.setName(random);
            demo.setEmail(random+"@gmail.com");
            dataShield.save(demo);
            assertNotEquals(0, demo.getId());
        }
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
