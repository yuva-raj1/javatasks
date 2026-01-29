package com.college.service;
import com.college.model.*;
public class StudentService {
public double cal_DiscountedFee(double Fee,int dis_percent) {
	if(dept.equals("IT")) {
		System.out.println("Eligible for discount");
		Fee-=(0.1*Fee);
		}
	else
		System.out.println("No discount");
	return dis_percent;
}
}
