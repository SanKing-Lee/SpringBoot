package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService demoPrototypeService1 =
                context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 =
                context.getBean(DemoPrototypeService.class);

        DemoSingletonService demoSingletonService1 =
                context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 =
                context.getBean(DemoSingletonService.class);

        System.out.println("Prototype: " + demoPrototypeService1.equals(demoPrototypeService2));
        System.out.println("Singleton: " + demoSingletonService1.equals(demoSingletonService2));

        context.close();
    }
}
