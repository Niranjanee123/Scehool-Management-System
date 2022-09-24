package entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Student implements Person {
		public int RollNo;
		private String FirstName;
		private String lastName;
		private String Email;
		private String CourseName;
		private int Percentage;
		
		public Student() {
			
		}
		
		 public Student(int RollNo,String FirstName, String lastName, String Email, String CourseName, int Percentage){
			
			 this.RollNo=RollNo;
			 this.FirstName=FirstName;
			 this.lastName=lastName;
			 this.Email=Email;
			 this.CourseName=CourseName;
			 this.Percentage=Percentage;
		 }
		
		
		public Student insert()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter rollNo");
			RollNo=sc.nextInt();
			
			System.out.println("Enter First Name");
			FirstName = sc.next();
			
			System.out.println("Enter Last Name");
			lastName =sc.next();
			
			System.out.println("Enter Email");
			Email=sc.next();
			
			System.out.println("Enter Course Name");
			CourseName=sc.next();
			
			System.out.println("Enter Percentage");
			Percentage=sc.nextInt();
			
	
			return new Student(RollNo,FirstName,lastName,Email,CourseName,Percentage);
		}
		
		@Override
		public void display(){
			
				System.out.println("Roll NO:" +
									RollNo +"\n First Name:" +FirstName + 
									"\n Last Name:" +lastName+
									"\n Email:" +Email +
									"\n Course Name:" + CourseName +
									"\n Percentage:" + Percentage);
			
				}
		
			
		
			
		public Student SearchByRollNo(Student[] array, int Rno) {
			for(int i=0; i<array.length; i++) {
				if(array[i].RollNo == Rno) {
					return array[i];
				}
			}
			return null;
			
		}
		
		
		public Student[] SearchByCourseName(Student[] array, String Course) {
			
			Student[] arr = new Student[array.length];
			
				for(int  i=0,j = 0; i< array.length ; i++) {
					   
					   if(array[i].CourseName .equals( Course)) { // tech    0   3   4
						   
						    arr[j] = array[i];
						    
					   }
			}
				return arr;
		}
			
			
		}

		
		

