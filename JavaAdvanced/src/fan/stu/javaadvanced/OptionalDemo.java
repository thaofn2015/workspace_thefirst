package fan.stu.javaadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional optional1 = Optional.empty();
        
        String str2 = "Optional demo";
        Optional<String> optional2 = Optional.of(str2);
        
        String str3 = null;
        Optional<String> optional3 = Optional.ofNullable(str3);
        System.out.println(optional2.get());

        // Sung dung Optional.ofNullable
        Employee emp = createEmployee();
        Optional<Employee> optional4 = Optional.ofNullable(emp);
        if (optional4.isPresent()) {
            System.out.println(optional4.get().getName());
        }
        optional4.ifPresent(s -> System.out.println(s.getName()));

        // Su dung Optional.orElseGet
        List<String> list = getList().orElseGet(() -> new ArrayList<>());
        System.out.println(list);

        // Su dung Optional.map
        Optional<Employee> optional5 = createEmployeeOptional();
        System.out.println(optional5.map(Employee::getName).orElse("other"));

        // Su dung Optional.flatMap
        Optional<Optional<String>> optional6 = Optional.of(Optional.of("flatMap"));
        System.out.println(optional6.map(op -> op.map(String::toUpperCase)).get());
        System.out.println(optional6.flatMap(op -> op.map(String::toUpperCase)).get());
        
        // Su dung filter
        Optional<String> optional7 = Optional.of("gpcoder");
        System.out.println(optional7.filter(x -> x.equals("gpco1der")));

        // Su dung orElseThrow
        Optional<String> shouldNotBeEmpty = Optional.empty();
        System.out.println(shouldNotBeEmpty.orElseThrow(() -> new IllegalStateException("This should not happen!!!")));

    }

    private static Optional<List<String>> getList() {
        return Optional.ofNullable(Arrays.asList("Phan", "Ngoc", "Thao"));
        // return Optional.ofNullable(null);
    }

    private static Employee createEmployee() {
        // return new Employee("Thao");
        return null;
    }

    private static Optional<Employee> createEmployeeOptional() {
        // return Optional.ofNullable(new Employee("Thao"));
        return Optional.ofNullable(null);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
