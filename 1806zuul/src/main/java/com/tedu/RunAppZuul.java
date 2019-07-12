package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class RunAppZuul {
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppZuul.class, args);
	}

}
