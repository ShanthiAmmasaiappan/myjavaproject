package learnCollections;

public class Employee {
	private String employeeName;
	private String employeeDesignation;
	
	public Employee(String employeeName, String employeeDesignation) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

}
