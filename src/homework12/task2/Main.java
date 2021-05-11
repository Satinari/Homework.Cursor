package homework12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 5));
        int collector = list.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.collectingAndThen(Collectors.toSet(), Set::size),
                (count, sortCount) -> (int) (((double) sortCount / count) * 100)));
        System.out.printf("Procent of uniqueness = %s%%", collector);
    }
}
