package ch1.diconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
