package com.Crud_operationSpringBoot.Crud_OperationSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HazelcastAutoConfiguration.class})
public class CrudOperationSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationSpringBootApplication.class, args);
	}
}
