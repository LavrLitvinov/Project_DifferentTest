package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Dmitriy", Arrays.asList
                (new Course("Math"), new Course("Bio"), new Course("ATM"))));

        students.add(new Student("Olesia", Arrays.asList
                (new Course("Math"), new Course("Rus"), new Course("ATM"),
                        new Course("HOT"))));

        students.add(new Student("Alex", Arrays.asList
                (new Course("PORT"), new Course("Bio"), new Course("ATM"), new Course
                        ("Testing"))));
        students.add(new Student("Ksenia", Arrays.asList
                (new Course("PORT"), new Course("Bio"), new Course("ATM"),
                        new Course("Testing"), new Course("PROM"))));

        System.out.println(students.stream()
                .map(student -> student.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1,s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course =  new Course("Math");
        System.out.println(students.stream()
                .filter(f -> f.getCourses().contains(course))
                .collect(Collectors.toList()));


    }
}
