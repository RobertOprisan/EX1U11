import java.util.*;
public class HashSetExampleIntersection {
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> setTemp = new HashSet<T>(set1);
        setTemp.retainAll(set2);
        return setTemp;
    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(4);
        set2.add(6);
        System.out.println(intersection(set1, set2));
    }
}