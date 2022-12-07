package interviewjavaquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Shanthi");
		arrayList.add("Kavi");
		arrayList.add("Kani");
		arrayList.add("Kayal");
		arrayList.add("navi");
		
		System.out.println(arrayList);
		Collections.reverse(arrayList);	
		System.out.println(arrayList);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(34);
		list.add(78);
		list.add(12);
		list.add(45);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
