package ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//bean needed to be wired
@Service
public class DemoService {
    //attribute to be wired
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }
    public void setAnother(String another){
        this.another = another;
    }
}
