import java.util.*;
public class HashSetExample3 {
    public static void printDuplicates( String[] array) {
        List<String> list =
                new ArrayList<String>(Arrays.asList(array));
        Set<String> hashSet = new HashSet<String>(list);
//System.out.println(hashSet);
        for (String s: hashSet) {
            list.remove(s);
        }
        Set<String> duplicates = new HashSet<String>(list);
        System.out.println(duplicates);
    }
    public static void main(String[] args) {
        String[] array = {"hola", "adios", "hola", "hola",
                "tres", "cuatro", "adios"};
        printDuplicates(array);
    }
}