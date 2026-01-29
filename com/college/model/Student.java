package com.college.model;

public class Student extends Person{
private int studentId;
public String dept;
private String courseName;
public Student() {}
public Student(int studentId,String dept,String courseName) {
	this.studentId=studentId;
	this.dept=dept;
	this.courseName=courseName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public static void main(String[] args) {
	Student st=new Student();
	Student st1=new Student(101,"IT","ABC");
	st.display_StDetails();
	st1.display_StDetails();	
}

public void display_StDetails() {
	System.out.println("Student Id:"+studentId);
	System.out.println("Department:"+dept);
	System.out.println("Course Name:"+courseName);
}
}
