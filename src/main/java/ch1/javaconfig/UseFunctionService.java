package ch1.javaconfig;

public class UseFunctionService {
    FunctionService functionService;
    UseFunctionService(){
        functionService = new FunctionService();
    }
    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }
    public FunctionService getFunctionService(){
        return this.functionService;
    }
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
