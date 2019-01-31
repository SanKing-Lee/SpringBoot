package ch1.diconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("sean"));
        context.close();
    }
}
