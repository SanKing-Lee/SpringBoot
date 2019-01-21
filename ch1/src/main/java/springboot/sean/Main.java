package springboot.sean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String []args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Diconfig.class);
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("World"));
        context.close();
    }
}
