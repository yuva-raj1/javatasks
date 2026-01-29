package elcblc_demo;

public class PayrollSystem {

	public static void main(String[] args) {
		Employee e_obj=new Employee();
		e_obj.setEmployeeId(901);
		e_obj.setEmployeeName("jagruth");
		double d_sal=e_obj.setSalary(50000);
		System.out.println(e_obj.executeDetails());
		//e_obj.setUpdate_Sal(10000);
		double d_sal1=d_sal+e_obj.setSalary(10000);
		System.out.println("Updated salary:"+ d_sal1);
	}
}
