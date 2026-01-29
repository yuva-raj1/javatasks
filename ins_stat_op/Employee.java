package ins_stat_op;

public class Employee {
	String Empname;
	int Empid;
	double Empsal;
	public void addEmpdetails(String nm,int id,double sal) {
	Empname=nm;
	Empid=id;
	Empsal=sal;
	}
	public String displaydetails() {
	return "Empname:"+Empname+""+"Empid:"+Empid+""+"Empsal:"+Empsal;
	} 
	public static void main(String[] args) {
	Employee e=new Employee();
	e.addEmpdetails("Ranjith", 631, 50105);
	System.out.println(e.displaydetails());
	}

}
