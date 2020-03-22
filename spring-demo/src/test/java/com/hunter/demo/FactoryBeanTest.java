package com.hunter.demo;


import com.hunter.demo.domain.User;
import com.hunter.demo.factory.UserFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryBeanTest {


    @Autowired
    private UserFactory userFactory;



    @Resource(name = "singleUserFactory")
    private User user3;

    @Resource(name = "singleUserFactory")
    private User user4;

    @Resource(name = "nonsingleUserFactory")
    private User user5;

    @Resource(name = "nonsingleUserFactory")
    private User user6;

    @Test
    public void exampleTest() {
        try {
            User user1  =  userFactory.getObject();
            System.out.printf("userName: %s, age: %d" , user1.getUserName(),user1.getAge());

            //System.out.printf("user1 == user2:",user1 == user2);

            System.out.println("user3 == user4: " + (user3 == user4));

            System.out.println("user5 == user6: " + (user5 == user6));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
