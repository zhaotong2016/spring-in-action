package com.hunter.demo.factory;

import com.hunter.demo.domain.User;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @ClassName SingleUserFactory
 * @Description
 * @Author Hunter
 * @Date2020/3/12 12:06
 **/
public class SingleUserFactory extends AbstractFactoryBean<User> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    protected User createInstance() throws Exception {
        return new User(name,age);
    }
}
