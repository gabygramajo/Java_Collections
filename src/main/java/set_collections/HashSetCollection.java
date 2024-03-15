package set_collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        hashSet.add("cuatro");
        hashSet.add("cinco");

        System.out.println("hashSet = " + hashSet);
        //>> hashSet = [cinco, uno, dos, tres, cuatro]
        
        boolean b = hashSet.add("tres");
        System.out.println("b = " + b);
        //>> false
    }
}
