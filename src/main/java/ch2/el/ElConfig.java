package ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

//configuration class
@Configuration
@ComponentScan("ch2.el")
@PropertySource("classpath: ch2/el/test.properties")
public class ElConfig {
    //normal string
    @Value("I Love You!")
    private String normal;

    //os attributes
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //express result
    @Value("{T(java.lang.Math).random()*100}")
    private double randomNumber;

    //other bean attributes
    @Value("#{demoService.another}")
    private String fromAnother;

    //file resource
    @Value("classpath:ch2/el/test.txt")
    private Resource testFile;

    //url resource
    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${repository.name}")
    private String repositoryName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(repositoryName);
            System.out.println(environment.getProperty("author"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
