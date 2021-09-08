package StreamApiEcsempels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class OrganizationStreamExampels {
    public static void main(String[] args) {
        List<Organization> organizations = new ArrayList<>();
        organizations.add(new Organization(1, "Polonoe", Arrays.asList (
                        new Worker("Oleg", 55, 100, "MANAGER" ),
                        new Worker("Dmitr", 35, 100, "MANAGER"),
                        new Worker("Elenf", 25, 200, "ENGENEER"),
                        new Worker("Anton", 35, 190,"ENGENEER"))));

        organizations.add(new Organization(2, "Strukovo", Arrays.asList (
                new Worker("Nikolai", 55, 100, "MANAGER"),
                new Worker("Oleg", 55, 600, "DIRECTOR"),
                new Worker("Orsana", 29, 210, "ENGENEER"),
                new Worker("Ksenia", 34, 134, "MANAGER"),
                new Worker("Orsana", 25, 200, "MANAGER"),
                new Worker("Anna", 33, 190,"ENGENEER"))));

        organizations.add(new Organization(3, "Pskovkirpich", Arrays.asList (
                new Worker("Michail", 78, 590, "DIRECTOR"),
                new Worker("Elena", 85, 200, "ENGENEER"),
                new Worker("Anton", 65, 196, "MANAGER"))));

        // Вернуть уникальные имена сотрудников компаний, где больше 3-х сотрудников

        System.out.println(organizations.stream()
                .filter(o -> o.getWorkerList().size() > 3)
                .map( o -> o.getWorkerList())
                .flatMap(w -> w.stream())
                .map(w -> w.getName())
                .collect(Collectors.toSet()));

        System.out.println(organizations.stream()
                .map(o -> o.getWorkerList())
                .flatMap(w -> w.stream())
                .collect(Collectors.groupingBy(w -> w.getPosition())));

        System.out.println(organizations.stream()
                .map(o -> o.getWorkerList())
                .flatMap(w -> w.stream())
                .collect(Collectors.groupingBy(w -> w.getPosition(), Collectors.averagingDouble
                        (g -> g.getSalary()))));

    }
}
