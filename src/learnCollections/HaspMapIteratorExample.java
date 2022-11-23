package learnCollections;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HaspMapIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    hashmap.put(33,"Value3");
	    hashmap.put(44,"Value4");
	    hashmap.put(55,"Value5");
	 
	    // Getting a Set of Key-value pairs
	    Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
	    
//	    Iterator<Class Name> iterator = objectName(Arraylist object name).iterator(); 

	    // Obtaining an iterator for the entry set
	    Iterator<Entry<Integer, String>> it = entrySet.iterator();
	 
	    // Iterate through HashMap entries(Key-Value pairs)
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(it.hasNext()){
	       Map.Entry me = (Map.Entry)it.next();
	       System.out.println("Key is: "+me.getKey() + 
	       " & " + 
	       " value is: "+me.getValue());
	   }
	    System.out.println("For Loop:");
        for (Map.Entry me : hashmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator<Entry<Integer, String>> iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 

	}

}
