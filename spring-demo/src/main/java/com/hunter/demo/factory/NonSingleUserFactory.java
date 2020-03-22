package com.hunter.demo.factory;

import com.hunter.demo.domain.User;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @ClassName NonSingleUserFactory
 * @Description
 * @Author Hunter
 * @Date2020/3/12 12:09
 **/
public class NonSingleUserFactory extends AbstractFactoryBean<User> {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //设置为非单例模式
    public NonSingleUserFactory(){
        setSingleton(false);
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
