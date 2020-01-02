package cc.eslink;

import cc.eslink.bean.Address;
import cc.eslink.bean.User;
import cc.eslink.mapper.AddressMapper;
import cc.eslink.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class YmlTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private AddressMapper addressMapper;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        for (int i = 0; i < 2; i++) {
            Address address = new Address("code" + i, "name" + i, "pid" + i, i, i);
            addressMapper.save(address);
        }
    }

    @Test
    public void test2() {
        // ds=cityId%2=0, table=sex%2=0
        int i = 0;
        User user = new User("user" + i, "phone" + i, "email" + i, "pwd" + i, 0, new Date(), 0);
        userMapper.save(user);

        i++;
        // ds=cityId%2=1, table=sex%2=0
        user = new User("user" + i, "phone" + i, "email" + i, "pwd" + i, 1, new Date(), 0);
        userMapper.save(user);

        i++;
        // ds=cityId%2=0, table=sex%2=1
        user = new User("user" + i, "phone" + i, "email" + i, "pwd" + i, 0, new Date(), 1);
        userMapper.save(user);

        i++;
        // ds=cityId%2=1, table=sex%2=1
        user = new User("user" + i, "phone" + i, "email" + i, "pwd" + i, 1, new Date(), 1);
        userMapper.save(user);
    }

    @Test
    public void test3() {
        List<Address> list = addressMapper.select(null, 0);
        System.out.println(list);
    }
}
