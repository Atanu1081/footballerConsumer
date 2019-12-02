package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pojoClasses.FootballerDetailsRequest;
import pojoClasses.FootballerDetailsResponse;

@SpringBootApplication
public class FootballerConsumerApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FootballerConsumerApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector connector)
	{
		return args -> {

			String name = "Neymar";
			if (args.length>0)
			{
				name=args[0];
			}

			FootballerDetailsRequest request = new FootballerDetailsRequest();
			request.setName(name);
			FootballerDetailsResponse response = (FootballerDetailsResponse)connector.callWebService("http://localhost:7111/service/footballer-details", request);
			System.err.println("Got response as below : ");
			System.out.println("Name : " + response.getFootballer().getName());
			System.out.println("Club : " + response.getFootballer().getClub());
			System.out.println("Country : " + response.getFootballer().getCountry());
		};

	}

}
