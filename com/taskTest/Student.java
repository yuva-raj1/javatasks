package com.taskTest;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
private int studentId;
private String studentName;
private int[]marks=new int[3];

public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getStudentId() {
	return studentId;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentName() {
	return studentName;
}

public void setMarks(int[] marks) {
	this.marks = marks;
}
public int[] getMarks() {
	return marks;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + Arrays.toString(marks)
			+ "]";
}

//Methods
double total=0,avg=0;
public double calculateTotal() {
	total=marks[0]+marks[1]+marks[2];
	return total;
}
public double calculateAverage() {
	 avg=total/3;
	return avg;
}
Predicate<Double> pr=avg-> avg>=35.0;
//	return false;
Function<Double, String> gradeCheck = avg -> {

	if (avg >= 75)
		return "A";
	else if (avg >= 60)
		return "B";
	else if (avg >= 50)
		return "C";
	else
		return "D";
};
Consumer<Double> eligibilityChecker=avg->{
	System.out.println(avg >=40 ?"Eligiblr for certificatess..!":"Not eligible");
};

public void resultStatus() {
System.out.println("Result: "+(pr.test(calculateAverage())?"Pass":"Fail"));
System.out.println("Eligible status: ");
eligibilityChecker.accept(calculateAverage());
}
public String displayStudentDetails() {
	
	return "Student ID "+getStudentId()
			+"\nStudent Name "+getStudentName()+
			"\nMarks "+ Arrays.toString(marks) 
			+"\nTotal "+calculateTotal()+
			"\nAverage "+calculateAverage()
			+"\nGrade: Grade "+gradeCheck.apply(calculateAverage() );
}

}
