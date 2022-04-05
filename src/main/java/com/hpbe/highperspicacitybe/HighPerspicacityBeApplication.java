package com.hpbe.highperspicacitybe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hpbe.highperspicacitybe.mapper")
@SpringBootApplication

public class HighPerspicacityBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HighPerspicacityBeApplication.class, args);
    }

}
