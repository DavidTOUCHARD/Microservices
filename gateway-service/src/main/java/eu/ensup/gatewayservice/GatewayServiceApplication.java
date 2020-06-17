package eu.ensup.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrix
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	//approche statique qui n'accepte pas plusieurs instance d'un meme microservice
//	@Bean
//	RouteLocator staticRoutes(RouteLocatorBuilder builder) {
//		return builder.routes().route(r -> r.path("/customers/**").uri("http://localhost:8081/").id("r1"))
//				.route(r -> r.path("/produits/**").uri("http://localhost:8082/").id("r2"))
//				.route(r -> r.path("/bills/**").uri("http://localhost:8083/").id("r3"))
//				.build();
//	}
	
	
	//approche statique qui accepte plusieurs instance d'un meme microservice
//	@Bean
//	RouteLocator staticRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/customers/**").uri("lb://CUSTOMER-SERVICE").id("r1"))
//				.route(r -> r.path("/produits/**").uri("lb://INVENTORY-SERVICE").id("r2"))
//				.route(r -> r.path("/bills/**").uri("lb://BILLING-SERVICE").id("r3"))
//				//.route(r -> r.path("/productItems/**").uri("lb://BILLING-SERVICE").id("r4"))
//				.build();
//	}
	
	// version dynamique
		@Bean
		DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,
				DiscoveryLocatorProperties ldp) {
			return new DiscoveryClientRouteDefinitionLocator(rdc,ldp);
		}

	

}
