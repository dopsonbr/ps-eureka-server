package com.dopsonbr.pseurekaserver;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@EnableEurekaServer
@SpringBootApplication
public class PsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsEurekaServerApplication.class, args);
	}
}
