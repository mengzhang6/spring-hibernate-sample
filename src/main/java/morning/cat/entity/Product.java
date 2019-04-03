package morning.cat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/3 7:22 PM
 */
@Setter
@Getter
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private int id;


    private String name;
    private String password;


    private String x;
}
