package ch1.aopconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ch1.aopconfig")
@EnableAspectJAutoProxy
public class AopConfig {

}
