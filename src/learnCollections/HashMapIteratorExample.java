package learnCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> courseMap = new HashMap<>();
		
		courseMap.put(1,"Civil");
		courseMap.put(2,"Computer Science");
		courseMap.put(3,"Mechanical");
		courseMap.put(4,"Electronics");
		courseMap.put(5,"Electrical");
		
		/* Iterate through a Hashmap EntrySet using Iterator*/
		
		Iterator<Entry<Integer, String>> iterator = courseMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		/* Iterate through a Hashmap KeySet using Iterator*/
		
		Iterator<Integer> iterator1 = courseMap.keySet().iterator();
		while(iterator1.hasNext()) {
			Integer key = iterator1.next();
			System.out.println(key);
			System.out.println(courseMap.get(key));
		}
		/* Iterate Hashmap  using For-each loop*/
		for(Map.Entry<Integer, String>entry : courseMap.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		/* Iterate through a Hashmap usinh Lamda expressions*/
		courseMap.forEach((key, value)  -> {
			System.out.println(key);
			System.out.println(value);
		});
		
		/* Loop through a Hashmap using Stream API*/
		courseMap.entrySet().stream().forEach((entry) -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		});
		
		
		
		
		
		

	}

}
