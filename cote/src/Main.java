import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> collect = arr.stream()
                .map(m -> m * m).
                collect(Collectors.toList());

        for (Integer i : collect) {
            System.out.println("i = " + i);

        }
    }

}