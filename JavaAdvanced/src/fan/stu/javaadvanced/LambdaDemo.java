package fan.stu.javaadvanced;

public class LambdaDemo implements Converter<Integer, String>{
    
    int num;
    public static void main(String[] args) {
        Sayable1 sayable1 = () -> "Hello";
        System.out.println(sayable1.say());
        
        Sayable2 sayable2 = (from, message) -> {
            return from + ": " + message;
        };
        System.out.println(sayable2.say("Thao", "Hello world!!!"));
        
        Sayable3 sayable3 = message -> message;
        System.out.println(sayable3.say("Hello World"));
        
        
        
    }
    @Override
    public String convert(Integer from) {

        return null;
    }
}

@FunctionalInterface
interface Sayable1 {
    public String say();
}

@FunctionalInterface
interface Sayable2 {
    public String say(String from, String message);
}

@FunctionalInterface
interface Sayable3 {
    public String say(String message);
}

@FunctionalInterface
interface Converter<F, T> {
    public T convert(F from);
}