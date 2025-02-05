import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Main {
    /**
     * 최대 힙? priorityQueue HashMap
     */
    public static void main(String[] args) throws IOException {
        String test = "2 1 1 3 5";
        String[] split = test.split(" ", 2);
        for (String s : split) {
            System.out.println("s = " + s);
        }

        Map<String, String> map = new HashMap<>();

        List<String> list = new ArrayList<>();

        List<String> list2 = new LinkedList<>(List.of("2","3","4", "5"));
        list2.get(3);
        System.out.println("list2 = " + list2);
    }
}

