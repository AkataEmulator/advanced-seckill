package com.suns.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suns.seckill.pojo")
public class AdvancedSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedSeckillApplication.class, args);
    }

}
