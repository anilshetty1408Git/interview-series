import com.practice.basic.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Krisha");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Krisha");

        System.out.println("Shallow comparison "  + (e1 == e2));
        System.out.println("Deep comparison " + (e1.equals(e2)));

        Stream<Integer> stream = Stream.iterate(1000,(Integer n)-> n+6000).limit(5);
        List<Integer> collect = stream.collect(Collectors.toList());
        System.out.println(collect);


    }
}