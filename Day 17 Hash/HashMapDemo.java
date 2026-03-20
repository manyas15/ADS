import java.util.*;
public class HashMapDemo{
    public static void main(String[] args){
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "One");
        hash.put(1, "Two");   // overriding
        System.out.println(hash);
    }
}

// output {1=Two} (same key value pair is overridden)