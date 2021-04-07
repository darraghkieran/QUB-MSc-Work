package collectionxamples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTreeSetExample {
	
public static void main(String[] args) {
        
	//SortedSet is an interface, TreeSet is a concrete class
        SortedSet<String> sset = new TreeSet<>();
        sset.add("Messi");
        sset.add("Eusabio");
        sset.add("Pele");
        sset.add("Ronaldo");
        
        System.out.println(sset.toString());
        
        System.out.println(sset.first());
        
        System.out.println(sset.last());
        
        sset.remove("Ronaldo");//dont need to worry about removing all occurrences as there's always one
        
        System.out.println(sset.toString());
    }
}
