import java.util.*;
public class HashSetExample2 {
    public static void printUnique( String[] array) {
//List<String> list = Arrays.asList(array);
        List<String> list =
                new ArrayList<String>(Arrays.asList(array));
        Set<String> hashSet = new HashSet<String>(list);
        System.out.println(hashSet);
    }
    public static void main(String[] args) {
        String[] array = {"hola", "adios", "hola", "hola",
                "tres", "cuatro", "adios"};
        printUnique(array);
    }
}