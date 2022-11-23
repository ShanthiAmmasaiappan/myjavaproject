package learncomposition;

import java.util.Scanner;

public class CompositionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();
		Employee e1 = new Employee("Xaver","123X","Bank teller.");
		Employee e2 = new Employee("Amar","123A","Manager");
		Employee e3 = new Employee("Beena","123B","Financial Advisor");
		Employee e4 = new Employee("Carrie","123C","Bank teller.");
		Employee e5 = new Employee("Daniel","123D","Bank teller.");
		Employee e6 = new Employee("Elle","123E","Mortgage consultant.");
		Employee e7 = new Employee("Frank","123F","Loan processor");
		Employee e8 = new Employee("George","123A","Credit analyst");
		Employee e9 = new Employee("Hendry","123A","Investment banker");
		Employee e10 = new Employee("Ivonna","123A","Investment representative");
		
		Scanner sc = new Scanner(System.in);
//		Employee[] employeeList =
		
		bank.addEmployee(e1);
		bank.addEmployee(e2);
		bank.addEmployee(e3);
		bank.addEmployee(e4);
		bank.addEmployee(e5);
		bank.addEmployee(e6);
		bank.addEmployee(e7);
		bank.addEmployee(e8);
		bank.addEmployee(e9);
		bank.addEmployee(e10);
		
		System.out.println("Enter the name of the employee");
		String employeeEntered = sc.next();
		
		
		bank.getDesignationreAndIdquested(employeeEntered);
		
		
	}

}
