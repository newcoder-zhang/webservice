package example;

/**
 * http://localhost:8080//services访问webservice
 */
public class HelloWorld {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}
