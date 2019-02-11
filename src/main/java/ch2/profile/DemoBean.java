package ch2.profile;

public class DemoBean {
    private String content;
    //constructor
    public DemoBean(String content){
        super();
        this.content = content;
    }
    //getter
    public String getContent(){
        return content;
    }
    //setter
    public void setContent(String content){
        this.content = content;
    }
}
