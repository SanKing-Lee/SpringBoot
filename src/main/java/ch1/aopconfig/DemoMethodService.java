package ch1.aopconfig;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("Method Add");
    }
}
