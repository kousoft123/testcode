package com.project.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
//@EnableAutoConfiguration
//@EnableSwagger2
//@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
public class SpringboottiketbookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottiketbookingsApplication.class, args);
	}
	
	 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

}
