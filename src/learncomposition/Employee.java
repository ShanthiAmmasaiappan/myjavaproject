package learncomposition;

public class Employee {

	private String employeeName;
	private String employeeId;
	private String employeeDesignation;

	public Employee(String employeeName, String employeeId, String employeeDesignation) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

}
