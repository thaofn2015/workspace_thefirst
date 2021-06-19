package fan.stu.javaadvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        
        // Stream to List: Collectors.toList()
        Stream<String> streamList = Arrays.asList("Thao", "Phan", "Ngoc").stream();
        System.out.println(streamList.collect(Collectors.toList()));
        
        // Stream to Set: Collectors.toSet()
        Stream<String> streamSet = Arrays.asList("Thao", "Phan", "Thao").stream();
        System.out.println(streamSet.collect(Collectors.toSet()));

        // Steam to Collection (LinkedList, LinkedHashSet, TreeSet): Collectors.toCollection
        Stream<String> streamCollection = Arrays.asList("Thao", "Phan", "Thao").stream();
        System.out.println(streamCollection.collect(Collectors.toCollection(LinkedList::new)));

        // Steam to Map: Collectors.toMap()
        mapDemo();
    }

    private static void mapDemo() {
        Stream<String> streamMap = Arrays.asList("Java", "C++", "C#", "PHP").stream();
        Map<String, Integer> map = streamMap.collect(Collectors.toMap(Function.identity(), String::length));
        // Map<String, Integer> map = streamMap.collect(Collectors.toMap(String::new, String::length));
        // map.forEach((key, value) -> System.out.println(key + ": " + value));

        Stream<Student> streamStudents = Arrays.asList(
                new Student("B", 70),
                new Student("A", 80),
                new Student("C", 75),
                new Student("A", 100)).stream();
        Map<String, Integer> map2 = streamStudents.collect(Collectors.toMap(Student::getName, Student::getAge, (s1, s2) -> s1 < s2 ? s1 : s2));
        map2.forEach((key, value) -> System.out.println(key + ": " + value));

        Stream<Student> streamStudents2 = Arrays.asList(
                new Student("B", 70),
                new Student("A", 80),
                new Student("C", 75),
                new Student("A", 100)).stream();
        LinkedHashMap<String, Integer> map3 = streamStudents2.collect(Collectors.toMap(Student::getName, Student::getAge, (s1, s2) -> (s1 < s2 ? s1 : s2), LinkedHashMap::new));
        map3.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    
}