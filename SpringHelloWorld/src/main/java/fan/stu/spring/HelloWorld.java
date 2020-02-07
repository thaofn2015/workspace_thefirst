package fan.stu.spring;

public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message: " + message);
    }

    public void initialize() {
        System.out.println("Init application.");
    }

    public void destroy() {
        System.out.println("Destroy application.");
    }
}
