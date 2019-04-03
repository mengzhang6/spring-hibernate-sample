import morning.cat.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/3 7:19 PM
 */
public class SessionFactoryTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = applicationContext.getBean("sessionFactory", SessionFactory.class);
        Session session = sessionFactory.openSession();

        Product product = new Product();
        product.setName("name");
        product.setPassword("123456");
        session.save(product);

        sessionFactory.close();
    }
}
