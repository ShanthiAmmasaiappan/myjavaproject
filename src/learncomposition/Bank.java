package learncomposition;

public class Bank {

	String bankName;
	Employee[] employee = new Employee[10];

	public void addEmployee(Employee employee) {
		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = employee;
				break;
			}
		}
	}

	public void getDesignationreAndIdquested(String designationEntered) {
		
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmployeeName().equalsIgnoreCase(designationEntered)) {
				System.out.println("Employee id = "+ employee[i].getEmployeeId());
				System.out.println("Employee designation = " + employee[i].getEmployeeDesignation());
				
				break;
			}
		}
		

	}
}
