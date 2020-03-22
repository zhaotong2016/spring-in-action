package com.hunter.demo.factory;

import com.hunter.demo.domain.User;
import org.springframework.beans.factory.FactoryBean;

import javax.annotation.PostConstruct;


public class UserFactory implements FactoryBean<User> {

    private String userName;

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public User getObject() throws Exception {
        System.out.printf("===>getObject begin");
        return new User(userName,age);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @PostConstruct
    public void initialize(){
        System.out.printf("===>initialize begin");
    }
}
