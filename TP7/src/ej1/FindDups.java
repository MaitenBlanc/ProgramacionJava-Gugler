package ej1;
import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        // Set<String> s = new HashSet<String>();
        SortedSet<String> s = new TreeSet<String>();
        
        for(String a: args)
            if (!s.add(a)) 
                System.out.println("Duplicado detectado: " + a);
        
                System.out.println(s.size() + " palabras distintas: " + s);
    }
}