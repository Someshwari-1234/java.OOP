import java.util.*;

public class SortThreadExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Someshwari", "Kiran", "Rahul");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
