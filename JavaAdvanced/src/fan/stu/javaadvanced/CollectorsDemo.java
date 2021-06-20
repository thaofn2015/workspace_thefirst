package fan.stu.javaadvanced;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
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

        // Collectors.collectingAndThen()
        Stream<String> streamCollectingAndThen = Arrays.asList("Thao", "Phan", "Thao").stream();
        System.out.println(streamCollectingAndThen.collect(Collectors.collectingAndThen(Collectors.toList(), x -> x.subList(1, 3))));

        // Collectors.joining()
        Stream<String> streamJoining = Arrays.asList("Thao", "Phan", "Thao").stream();
        System.out.println(streamJoining.collect(Collectors.joining(" - ", "[START]", "[END]")));

        // Collectors.counting()
        Stream<String> streamCounting = Arrays.asList("Thao", "Phan", "Thao").stream();
        System.out.println(streamCounting.collect(Collectors.counting()));

        // Collectors.summarizing
        Stream<String> streamSummarizing = Arrays.asList("Thao", "Phan", "Thao").stream();
        DoubleSummaryStatistics intSummaryStatistics = streamSummarizing.collect(Collectors.summarizingDouble(String::length));
        System.out.println(intSummaryStatistics);

        // Collectors.averagingDouble/Long/Int()

        // Collectors.summingDouble/Long/Int()

        // Collectors.maxBy()/ Collectors.minBy()
        Stream<String> streamMin = Arrays.asList("Thao1", "Phan22", "Thao").stream();
        System.out.println(streamMin.collect(Collectors.minBy((x, y) -> x.length() - y.length())));

        // Collectors.groupingBy()
        groupingByDemo();

        // Collectors.partitioningBy()
        partitioningByDemo();

        // Collectors.reducing()
        
    }

    private static void partitioningByDemo() {
        Stream<Student> streamStudents = Arrays.asList(
            new Student("A", 70),
            new Student("B", 80),
            new Student("C", 75),
            new Student("D", 75),
            new Student("E", 75),
            new Student("F", 75),
            new Student("G", 75),
            new Student("H", 100)).stream();

        Map<Boolean, Set<Student>> map = streamStudents.collect(Collectors.partitioningBy(s -> s.getAge() > 77, Collectors.toSet()));
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static void groupingByDemo() {
        Stream<Student> streamStudents = Arrays.asList(
                new Student("A", 70),
                new Student("B", 80),
                new Student("C", 75),
                new Student("D", 75),
                new Student("E", 75),
                new Student("F", 75),
                new Student("G", 75),
                new Student("H", 100)).stream();

        Map<Integer, Set<Student>> map = streamStudents.collect(Collectors.groupingBy(Student::getAge, Collectors.toSet()));
        map.forEach((key, value) -> System.out.println("Age: " + key + " - Number of Student: " + value.size()));
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