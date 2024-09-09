package com.gaurav.Rabbitmq_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqProducerApplication {

	public static void main(String[] args)
	{
		System.out.println("Rabbitmq Producer Application Started");
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

}
