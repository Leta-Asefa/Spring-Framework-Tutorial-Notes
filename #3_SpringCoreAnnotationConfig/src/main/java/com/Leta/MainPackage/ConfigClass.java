package com.Leta.MainPackage;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.Leta.MainPackage") // make sure that all class are @component
public class ConfigClass {

    //@Bean
//    Laptop getLaptop() {
//		return new Laptop();
//	}
//    
//    @Bean
//    Desktop getDesktop() {
//		return new Desktop();
//	}
//   
//    @Bean
//    Mobile getMobile() {
//		return new Mobile();
//	}
//    

}
