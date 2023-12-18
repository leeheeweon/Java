import java.util.ArrayList;

public class AddAllTest {
    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<>();
        ArrayList<String> test2 = new ArrayList<>();

        test1.add("a");
        test1.add("b");
        test1.add("c");

        test2.add("a");
        test2.add("c");
        test2.add("d");
        test2.add("db");

        test1.addAll(test2);
        for (String s : test1) {
            System.out.println("s = " + s);
        }
    }
}
