package StreamApiEcsempels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreatijnExempels {
    public static void main(String[] args) {
        IntStream.range(7,27)
                .forEach(System.out::print);

        System.out.println(Stream.iterate(2, x -> x * 5)
                .limit(10)
                .collect(Collectors.toList()));
        List<String> stringList = new ArrayList<>();
        IntStream.range(1,10).forEach(x -> stringList.add("test " + x));
        System.out.println(stringList);

    }
}
