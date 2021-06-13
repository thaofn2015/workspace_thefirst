package fan.stu.javaadvanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {

        // Cach su dung
        Function<String, Integer> convertStringToInteger = s -> Integer.valueOf(s);
        System.out.println(convertStringToInteger.apply("12"));

        // Chuyen doi object to object
        Function<User, Member> convertUserToMember = s -> new Member(s.name, s.email);
        System.out.println(convertUserToMember.apply(new User("Thao", "Thao@gmail.com", "123456a-")));

        // Chuyen doi list to list
        List<User> users = Arrays.asList(new User("gpcoder1", "gpcodervn1@gmail.com", "123"),
                                         new User("gpcoder2", "gpcodervn2@gmail.com", "124"),
                                         new User("gpcoder3", "gpcodervn3@gmail.com", "125"));
        System.out.println(users.stream().map(convertUserToMember).collect(Collectors.toList()));

        Function<Integer, Integer> times2 = n -> n * 2;
        Function<Integer, Integer> squared = n -> n * n;
 
        Function<Integer, Integer> andThen = times2.andThen(squared);
        System.out.println("Using andThen: " + andThen.apply(5)); // 100
 
        Function<Integer, Integer> compose = times2.compose(squared);
        System.out.println("Using compose: " + compose.apply(5)); // 50
    }
}

class User {
    String name;
    String email;
    String password;
 
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
 
class Member {
    String name;
    String email;
 
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
 
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + "]";
    }
}
