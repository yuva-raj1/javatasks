package elcblc_demo;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;

	public void setEmployeeId(int emp_id) {
		employeeId=emp_id;
	}
	public void setEmployeeName(String emp_nm) {
		employeeName=emp_nm;
	}
	public double setSalary(double sal) {
		salary=sal;
		return salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public String executeDetails() {
		return "EMPID:"+employeeId+"\nEMPNAME:"+employeeName+"\nEMPSAL:"+salary;
	}
//	public void setUpdate_Sal() {
//		salary=salary+s_sa;
//		//return salary;
//	}
}
