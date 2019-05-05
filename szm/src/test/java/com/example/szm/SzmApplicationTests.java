package com.example.szm;

import com.example.szm.entity.Persontest;
import com.example.szm.entity.Persontest1;
import com.example.szm.entity.Persontest2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SzmApplicationTests {
    @Autowired
    Persontest persontest;
    @Autowired
    Persontest2 persontest2;
    @Test
    public void contextLoads() {
        System.out.println(persontest2);
    }

}
