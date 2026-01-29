package com.college.model;

public class Person {
private  String name;
private int age;
private long ct_num;
public Person(){}
public Person(String name,int age,long ct_num) {
	this.name=name;
	this.age=age;
	this.ct_num=ct_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getCt_num() {
	return ct_num;
}
public void setCt_num(long ct_num) {
	this.ct_num = ct_num;
}

}
