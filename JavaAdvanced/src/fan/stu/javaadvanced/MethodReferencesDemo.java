package fan.stu.javaadvanced;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        MethodReferencesDemo demo = new MethodReferencesDemo();

        // demo.withStatciMethod();

        // demo.instanceMethod();

        demo.withConstructor();

    }

    ///////////////// Static Method Start/////////////////
    private void withStatciMethod() {
        System.out.println(toDo(1, 2, MathUtil::add));
        System.out.println(toDo(4, 2, MathUtil::minus));
    }

    private int toDo(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    } 

    interface ExecuteFunction {
        int execute(int a, int b);
    }

    class MathUtil {
        static int add(int a, int b) {
            return a + b;
        }

        static int minus(int a, int b) {
            return a - b;
        }
    }
    ///////////////// Static Method End/////////////////

    ///////////////// Instance Method Start/////////////////
    private void instanceMethod() {
        MathUtil2 mathUtil = new MathUtil2();
        System.out.println(toDo(1, 22, mathUtil::add));

        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };
        // Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.sort(stringArray, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println(Arrays.asList(stringArray));
    }

    class MathUtil2 {
        public int add(int a, int b) {
            return a + b;
        }

        public int minus(int a, int b) {
            return a - b;
        }
    }
    ///////////////// Instance Method End/////////////////

    ///////////////// Constructor Start/////////////////
    private void withConstructor() {
        HelloInterface hello = Hello::new;
        hello.sayHello("I say Hello");
    }

    interface HelloInterface {
        void sayHello(String message);
    }

    class Hello implements HelloInterface{
        public Hello(String a) {
            System.out.println("New hello");
        }

        @Override
        public void sayHello(String message) {
            System.out.println("I say new Hello");
        }
    }
    ///////////////// Constructor End/////////////////
}

