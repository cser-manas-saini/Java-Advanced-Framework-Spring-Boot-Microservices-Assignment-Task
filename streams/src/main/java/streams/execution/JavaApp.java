package streams.execution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;

public class JavaApp {

    public static void execution() {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 22; i++) {
            list.add(i);
        }

        System.out.println(list);

        Stream<Integer> stream = list.stream();

        Predicate<Integer> isEven = (n) -> (n % 2 == 0);
     
        Stream<Integer> data = stream.filter(isEven);

       Set<Integer> result= data.collect(Collectors.toSet());
         System.out.println(result);
        }
    }
