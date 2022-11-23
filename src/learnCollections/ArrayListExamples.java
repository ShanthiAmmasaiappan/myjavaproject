package learnCollections;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			String[] nameList = new String[10];

			// Declaring a String ArrayList
			ArrayList<String> nameArrayList = new ArrayList<String>();

			ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

			ArrayList<Double> doubleArrayList = new ArrayList<Double>();

			ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>();

			// Adding Elements into an ArrayList
			nameArrayList.add("Swaroop");
			nameArrayList.add("Ketaki");
			nameArrayList.add("Daman");
			nameArrayList.add("Navjot");

			// Get the String representation of the ArrayList
			System.out.println(nameArrayList.toString());

			// Getting the value by index
			System.out.println(nameArrayList.get(0));

			int i = 0;
			for (i = 0; i < nameArrayList.size(); i++) {
				if (nameArrayList.get(i).equals("Navjot")) {
					System.out.println(nameArrayList.get(i) + "Name is Present");
					break;
				}

			}
			if (i == nameArrayList.size() - 1) {
				System.out.println("Name is not present");
			}

			System.out.println("Name is present: " + nameArrayList.contains("Navjot"));

			// Remove a value from the ArrayList
			nameArrayList.remove("Navjot");
			System.out.println(nameArrayList.toString());
			
			System.out.println("Ketaki is present at the index: "+nameArrayList.indexOf("Ketaki"));
			
			
			Account harinderAccount = new Account("Harinder", "78901234");
			Account sanilAccount = new Account("Sanil", "45610234");
			Account kuldeepAccount = new Account("Kuldeep", "012345678");
			
			ArrayList<Account> accountList = new ArrayList<Account>();
					
			accountList.add(harinderAccount);
			accountList.add(sanilAccount);
			accountList.add(kuldeepAccount);
			
			String accountToBeRetrieved = "78901234";
			for(i=0;i<accountList.size();i++) {
				if(accountList.get(i).getAccountNumber().equals(accountToBeRetrieved)) {
					System.out.println(accountList.get(i).getAccountName());
				}
			}
			
			
			System.out.println(nameArrayList.toString());
			nameArrayList.clear();
			System.out.println(nameArrayList.toString());

	}

}
