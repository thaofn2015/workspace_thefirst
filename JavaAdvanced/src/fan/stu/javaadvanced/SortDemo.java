package fan.stu.javaadvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {

        List<String> list1 = createDumyData();
        List<String> list2 = createDumyData();

        System.out.println("---------------Before---------------");
        System.out.println(list1);

        System.out.println("---------------After 7---------------");
        sortUsingJava7(list1);
        System.out.println(list1);

        System.out.println("---------------After 8---------------");
        sortUsingJava8(list2);
        System.out.println(list2);
        
        List<Student> list3 = createDumyData2();
        sortUsingJava72(list3);
//        System.out.println(list3);
        sortUsingJava82(list3);
        System.out.println(list3);
 
    }

    private static void sortUsingJava7(List<String> list) {
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void sortUsingJava8(List<String> list) {
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
    }

    private static List<String> createDumyData() {
        List<String> result = new ArrayList<String>();

        result.add("Java");
        result.add("C++");
        result.add("C#");
        result.add("PHP");
        result.add("Javascript");

        return result;
    }

    private static List<Student> createDumyData2() {
        List<Student> result = new ArrayList<Student>();

        result.add(new Student("Phan", 29));
        result.add(new Student("Ngoc", 43));
        result.add(new Student("Thao", 31));

        return result;
    }
    
    private static void sortUsingJava72(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        });
    }
    
    private static void sortUsingJava82(List<Student> list) {
//        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        Collections.sort(list, ((s1, s2) -> s1.getAge() - s2.getAge()));
    }
}

class Student {
    private String name;

    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
