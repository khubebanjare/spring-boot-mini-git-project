package org.kk.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;

@Cacheable
@SpringBootApplication
@ComponentScan("org.kk.spring.boot")
public class SpringBootMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMiniProjectApplication.class, args);
	}

}
