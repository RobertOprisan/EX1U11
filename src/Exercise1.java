import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(7);
        for (Integer i: set) {
            System.out.println(i);
        }
    }
}