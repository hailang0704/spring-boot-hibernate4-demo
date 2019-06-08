package com.lzt.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@EnableJpaRepositories
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@ImportResource("classpath:hibernate.cfg.xml")
//@EntityScan("com.lzt.demo.springboot.entity")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
