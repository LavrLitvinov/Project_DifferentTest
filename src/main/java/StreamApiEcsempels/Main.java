package StreamApiEcsempels;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        final List<OurForest> ourForests = new ArrayList<>();

        ourForests.add(new OurForest("Got", "Gotov", 233,
                "Low", 123, OurForest.Position.VATERMAN));
        ourForests.add(new OurForest("Slon", "Hobotov",
                245, "Big", 233, OurForest.Position.XRYN));
        ourForests.add(new OurForest("Peny", "Berioza",
                44, "Low", 10, OurForest.Position.FORESTER));
        ourForests.add(new OurForest("Vetka", "Sosna",
                420, "Big", 11, OurForest.Position.FORESTER));
        ourForests.add(new OurForest("Lex", "Valensa",
                78, "Pidor", 1000, OurForest.Position.LESHYI));
        ourForests.add(new OurForest("Mathematichka", "Dura",
                30, "Suka", 1030, OurForest.Position.VEDMA));
        ourForests.add(new OurForest("Klassniy", "Prepod",
                50, "Prepod", 15000, OurForest.Position.FAIRY));
        ourForests.add(new OurForest("Vetkina", "El",
                430, "Big", 11, OurForest.Position.FORESTER));
        ourForests.add(new OurForest("Palka", "Olha",
                426, "Low", 18, OurForest.Position.FORESTER));
        ourForests.add(new OurForest("Pocka", "Vesna",
                29, "Suk", 1090, OurForest.Position.VEDMA));


        //     System.out.println (ourForests.stream()
        //          .filter(o -> o.getPosition() == OurForest.Position.VEDMA)
        //           .sorted((o1, o2) -> o1.getSalary() - o2.getSalary())
        //           .collect(toList()));

        List<OurForest> param = (ourForests.stream()
                .filter(o -> o.getPosition() == OurForest.Position.VEDMA)
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .collect(toList()));

        //    System.out.println(Arrays.toString(new List[]{param}));


        Optional<Integer> itog = ourForests.stream()
                .map(o -> o.getAge())
                .reduce((o1, o2) -> o1 + o2);
        System.out.println(itog);

        Stream<Integer> integerStream = Stream.of();
        Optional<Integer> optionalInteger = integerStream.reduce((a1, a2) -> a1 + a2);

        if (optionalInteger.isPresent()) {
            System.out.println("Result: " + optionalInteger.get());
        }
        Stream.of("123", "1234", "34455", "94848", "123")
                .distinct()
                .forEach(p -> System.out.println(p));

        Stream.of("123", "1234", "34455", "94848", "123")
                .collect(Collectors.toSet());

        Integer[][] integers = new Integer[][]{{1, 2, 3, 4}, {5, 6, 7, 8, 9, 10, 11}};
        Stream.of(integers)
                .flatMap(a -> Stream.of(a))
                .forEach(System.out::println);


    }

}
