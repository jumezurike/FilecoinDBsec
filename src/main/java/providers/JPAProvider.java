package providers;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class JPAProvider {

    @PersistenceContext(unitName = "mysql")
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
            em = emf.createEntityManager();
        }
        return em;
    }

    public static void close() {
        if (em != null) {
            em.close();
        }
    }
}
