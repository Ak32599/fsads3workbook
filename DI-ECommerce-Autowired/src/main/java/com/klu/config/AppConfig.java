//package com.klu.config;
//
//import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConfigurationScan(basePackages="com.klu.model")
//
//public class AppConfig {
//	
//}
package com.klu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.klu") 
public class AppConfig {
}
