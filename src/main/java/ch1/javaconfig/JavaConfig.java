package ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public UseFunctionService useFunctionService(){
        return new UseFunctionService();
    }
}
