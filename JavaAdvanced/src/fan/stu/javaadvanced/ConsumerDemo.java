package fan.stu.javaadvanced;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        // Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
    }
}
