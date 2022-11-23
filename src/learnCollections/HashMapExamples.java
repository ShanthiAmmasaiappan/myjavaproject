package learnCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> phoneNumberList = new HashMap<String, String>();

		// Adding key value pairs on the HashMap
		phoneNumberList.put("1234567890", "Daman");
		phoneNumberList.put("4567890123", "Navjot");
		phoneNumberList.put("7890123456", "Sahib");

//		System.out.println(phoneNumberList.get("7890123456"));

		phoneNumberList.put("7890123456", "Kuldeep");

//		System.out.println(phoneNumberList.get("7890123456"));

//		Employee parul = new Employee("Parul", "QA");
//		Employee neethu = new Employee("Neethu", "Developer");
//		Employee jasmeet = new Employee("Jasmeet", "BSA");

		HashMap<Integer, Employee> employeeList = new HashMap<Integer, Employee>();

		List<Employee> mechanical = new ArrayList<Employee>();
		List<Employee> electronic = new ArrayList<Employee>();

		mechanical.add(new Employee("Parul", "QA"));
		mechanical.add(new Employee("Neethu", "Developer"));
		electronic.add(new Employee("Jasmeet", "BSA"));

		employeeList.put(101, new Employee("Parul", "QA"));
		employeeList.put(102, new Employee("Neethu", "Developer"));
		employeeList.put(103, new Employee("Jasmeet", "BSA"));

//		System.out.println(employeeList.get(102).getEmployeeName());

		HashMap<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();

		employeeMap.put("Mechanical", mechanical);

		employeeMap.put("Electronics", electronic);

//		System.out.println(employeeMap.get("Electronics").get(0).getEmployeeName());

		HashMap<String, Boolean> isPresent = new HashMap<String, Boolean>();

		isPresent.put("Lekshmi", true);
		isPresent.put("Kuldeep", true);
		isPresent.put("Jattan", false);

		ListIterator<Employee> iterator = mechanical.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getEmployeeName());
			
/*			 Iterate through HashMap using the forEach loop      */
			// iterating through key/value mappings
			System.out.print("Entries: ");
			for (Entry<String, Boolean> entry : isPresent.entrySet()) {
				System.out.print(entry);
				System.out.print(", ");
			}

			// iterating through keys
			System.out.print("\nKeys: ");
			for (String key : isPresent.keySet()) {
				System.out.print(key);
				System.out.print(", ");
			}

			// iterating through values
			System.out.print("\nValues: ");
			for (Boolean value : isPresent.values()) {
				System.out.print(value);
				System.out.print(", ");
			}
		}
/*		Iterate through HashMap using iterator()    */

		// create an object of Iterator
		Iterator<Entry<String, Boolean>> iterate1 = isPresent.entrySet().iterator();

		// iterate through key/value mappings
		System.out.print("Entries: ");
		while (iterate1.hasNext()) {
			System.out.print(iterate1.next());
			System.out.print(", ");
		}

		// iterate through keys
		Iterator<String> iterate2 = isPresent.keySet().iterator();
		System.out.print("\nKeys: ");
		while (iterate2.hasNext()) {
			System.out.print(iterate2.next());
			System.out.print(", ");
		}

		// iterate through values
		Iterator<Boolean> iterate3 = isPresent.values().iterator();
		System.out.print("\nValues: ");
		while (iterate3.hasNext()) {
			System.out.print(iterate3.next());
			System.out.print(", ");
		}
	}
}
