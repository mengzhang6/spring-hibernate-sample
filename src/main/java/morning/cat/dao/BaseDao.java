package morning.cat.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/3 7:54 PM
 */
@Component
public class BaseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private HibernateTemplate hibernateTemplate;


}
