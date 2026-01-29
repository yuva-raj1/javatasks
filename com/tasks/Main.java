package com.tasks;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number to be checked:");
     int num=sc.nextInt();
     int temp=num,count=0;
     while(num>0){
         count++;
         num=num/10;
     }
//     System.out.println("count:"+count);
         
     boolean status=false;
     while(count>1)
     {
         int d1=temp%10;
         if(d1==0 && count!=1)
             status=true;
         temp/=10;
         count--;
     }
     if(status)
          System.out.println("Duck number check success...!");
     else
         System.out.println("Unsuccessful duck number check..!");  
     sc.close();
 }
}