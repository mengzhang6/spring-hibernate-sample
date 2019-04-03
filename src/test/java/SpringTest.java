import morning.cat.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/3 7:19 PM
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class SpringTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Test
    public void test() {
        Session session = sessionFactory.openSession();

        Product product = new Product();
        product.setName("name");
        product.setPassword("123456");
        session.save(product);

        sessionFactory.close();

    }

    @Test
    public void test2() {
        Product product = new Product();
        product.setName("name");
        product.setPassword("333444");
        product.setX("xxx");
        hibernateTemplate.save(product);
    }
}
