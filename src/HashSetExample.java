import java.util.*;
public class HashSetExample {
    public static HashSet<Integer> increment( HashSet<Integer> set) {
        Iterator<Integer> it = set.iterator();
        int number;
        HashSet<Integer> newSet = new HashSet<Integer>();
        while (it.hasNext()) {
            number = it.next();
            number++;
            newSet.add(number);
        }
        return newSet;
    }
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(1);
        System.out.println(set);
        set = increment(set);
        System.out.println(set);
    }
}