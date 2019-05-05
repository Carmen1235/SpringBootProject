package com.example.szm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SzmApplication {


    public static void main(String[] args) {
        //SpringApplication.run(SzmApplication.class, args);去掉spring的启动标
        SpringApplication application = new SpringApplication(SzmApplication.class);
        application.setBannerMode(Banner.Mode.OFF);application.run(args);


    }

}
