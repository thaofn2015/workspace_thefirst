package fan.stu.javaadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        countEvenNumber();

        primitiveStream();

        convertToStream();

        convertFromStream();

        filterAndLimit();

        limitAndSkip();

        map();

        sort();

        match();

        minMax();

        summaryStatistics();

        reduce();

        parallelStream();

    }

    private static void parallelStream() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long startTime = System.nanoTime();
 
        // long count = values.stream().sorted().count();
        long count = values.parallelStream().sorted().count();
        System.out.println(count);
 
        long endTime = System.nanoTime();
 
        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
 
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static void reduce() {
        int result = IntStream.of(1, 2, 3, 4).reduce(1, (a, b) -> a - b);
        System.out.println(result);
    }

    private static void summaryStatistics() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 10);
 
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());

        class Programing {
            private String name;
            private int exp;
         
            public Programing(String name, int age) {
                super();
                this.name = name;
                this.exp = age;
            }
         
            public String getName() {
                return name;
            }
         
            public int getExp() {
                return exp;
            }
        }

        List<Programing> students = Arrays.asList( //
                new Programing("Java", 5), //
                new Programing("PHP", 2), //
                new Programing("C#", 1) //
        );

        IntSummaryStatistics stats2 = students.stream().mapToInt((x) -> x.getExp()).summaryStatistics();
        System.out.println("Count: " + stats2.getCount());
        System.out.println("Max: " + stats2.getMax());
        System.out.println("Min: " + stats2.getMin());
        System.out.println("Sum: " + stats2.getSum());
        System.out.println("Average: " + stats2.getAverage());

        System.out.println(students.stream().mapToInt(x -> x.getExp()).sum());
    }

    private static void minMax() {
        Integer[] numbers = {1, 8, 3, 4, 5, 7, 9, 6};
        System.out.println(Stream.of(numbers).min(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(Stream.of(numbers).max(Comparator.comparing(Integer::valueOf)).get());

        List<Integer> listNumber = Arrays.asList(numbers);
        System.out.println(listNumber.stream().mapToInt(v -> v).min().getAsInt());
        System.out.println(listNumber.stream().mapToInt(v -> v).max().getAsInt());

        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(Stream.of(doubles).min(Comparator.comparing(Double::valueOf)).get());

        List<Double> listDoubles = Arrays.asList(doubles);
        System.out.println(listDoubles.stream().mapToDouble(v -> v).max().getAsDouble());

        System.out.println(listDoubles.stream().max(Comparator.comparing(Double::valueOf)).get());


        
        class Programing {
            private String name;
            private int exp;
         
            public Programing(String name, int age) {
                super();
                this.name = name;
                this.exp = age;
            }
         
            public String getName() {
                return name;
            }
         
            public int getExp() {
                return exp;
            }
        }

        List<Programing> students = Arrays.asList( //
                new Programing("Java", 5), //
                new Programing("PHP", 2), //
                new Programing("C#", 1) //
        );
 
        // Max = 5
        Programing maxByExp = students.stream()
                .max(Comparator.comparing(Programing::getExp))
                .get(); 
         
        // Min = 1
        Programing minByExp = students.stream()
                .min(Comparator.comparing(Programing::getExp))
                .get();
    }

    private static void match() {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        System.out.println(data.stream().allMatch(x -> x.equals("Java")));
        System.out.println(data.stream().noneMatch(x -> x.equals("Java1")));
        System.out.println(data.stream().anyMatch(x -> x.equals("PHP")));
    }

    private static void sort() {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        data.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
    }

    private static void map() {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        data.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    private static void limitAndSkip() {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        data.stream().skip(1).limit(3).forEach(System.out::println);
    }

    private static void filterAndLimit() {
        Stream.iterate(1, count -> count + 1).filter(count -> count % 3 == 0).limit(6).forEach(System.out::println);
    }

    // tao stream sang cau tru du lieu khac
    private static void convertFromStream() {
        // Stream to Collection
        Stream<String> stream1 = Stream.of("Java", "C#", "PHP");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);

        // Stream to array
        Stream<String> stream2 = Stream.of("Java", "C#", "PHP");
        String[] array = stream2.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

    // tao stream tu cac cau truc du lieu khac
    private static void convertToStream() {
        // Generate stream from array
        String[] languages = {"Java", "C#", "PHP"};
        Arrays.stream(languages).forEach(System.out::println);;
        Stream.of(languages).forEach(i -> System.out.println(i));

        // Generate stream from collections
        List<String> list = Arrays.asList("Java", "C#", "PHP");
        list.stream().forEach(System.out::println);

        // Generate stream su dụng Stream.genarate()
        Stream<String> stream = Stream.generate(() -> "thaopn").limit(3);
        String[] array = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        // Genarate stream from Stream.iterate
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumbers.forEach(System.out::print); // 12345

        // Generate Streams from APIs like Regex
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::println);// Welcometogpcoder
    }

    private static void countEvenNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long count = numbers.stream().filter(number -> (number % 2 == 0)).count();

        System.out.println(count);
    }

    // tao stream cho nhung kieu primitive
    private static void primitiveStream() {
        IntStream.of(1, 10).forEach(i -> System.out.println(i));

        IntStream.range(1, 10).forEach(i -> System.out.println(i));

        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        DoubleStream.of(1, 2, 3).forEach(System.out::println);
 
        LongStream.range(1, 4).forEach(System.out::println);
 
        LongStream.of(1, 2, 3).forEach(System.out::println);
    }

}
