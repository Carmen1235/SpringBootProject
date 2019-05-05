package com.example.szm.entity;

import com.example.szm.entity.DogDao;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component   //纳入ioc的容器之中代表bean
@ConfigurationProperties(prefix = "person")  //需要给配置文件加个前缀，才读的到
public class Persontest {

    String lastName;
    int age;
    boolean boss;
    Date birth;
    Map<String,String> maps;

    List<String> list;

    DogDao dogDao;

    @Override
    public String toString() {
        return "Persontest{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", list=" + list +
                ", dogDao=" + dogDao +
                '}';
    }

    public DogDao getDogDao() {
        return dogDao;
    }

    public void setDogDao(DogDao dogDao) {
        this.dogDao = dogDao;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


}
