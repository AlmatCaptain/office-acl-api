package kz.iitu.office.acl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OfficeAclApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeAclApiApplication.class, args);
	}

}
