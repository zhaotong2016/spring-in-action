package com.hunter.demo.config;

import com.hunter.demo.factory.NonSingleUserFactory;
import com.hunter.demo.factory.SingleUserFactory;
import com.hunter.demo.factory.UserFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {


    @Bean
    public UserFactory userFactory(){
        UserFactory userFactory = new UserFactory();
        userFactory.setUserName("Hunter");
        userFactory.setAge(29);
        return userFactory;
    }

    @Bean
    public SingleUserFactory singleUserFactory(){
        SingleUserFactory userFactory = new SingleUserFactory();
        userFactory.setName("Hunter");
        userFactory.setAge(29);
        return userFactory;
    }


    @Bean
    public NonSingleUserFactory nonsingleUserFactory(){
        NonSingleUserFactory userFactory = new NonSingleUserFactory();
        userFactory.setName("Hunter");
        userFactory.setAge(29);
        return userFactory;
    }
}
