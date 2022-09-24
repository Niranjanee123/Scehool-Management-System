package entity;

import java.util.Scanner;

public class Teacher implements Person {

	int TeacherId;
	String Name;
	String Gender;
	String Department;
	
	public Teacher() {
		
	}
	
	public Teacher(int TeacherId, String Name, String Gender, String Department){
		this.TeacherId=TeacherId;
		this.Name=Name;
		this.Gender=Gender;
		this.Department=Department;
		
	}
	
	
	public Teacher insert() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Teacher Id");
		TeacherId=sc.nextInt();
		
		System.out.println("Enter Name");
		Name = sc.next();
		
		System.out.println("Enter Gender");
		Gender =sc.next();
		
		System.out.println("Enter Department");
		Department=sc.next();
		
		return new Teacher(TeacherId,Name,Gender,Department);
		
		
	}

	@Override
	public void display() {
		System.out.println("Teacher Id:" + TeacherId +
							"\n Teacher Name:" + Name +
							"\n Teacher Gender:" +Gender +
							"\n Teacher Department:" +Department);
		
	}
	
	public Teacher SearchById(Teacher[] arr, int Id) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].TeacherId==Id) {
				return arr[i];
			}
		}
		
		return null;
		
	}
	
	public Teacher[] SearchByDepartment(Teacher[] arr, String Dept) {
		
		Teacher[] arr1=new Teacher[arr.length];
		
		for(int i=0 ,j=0; i<arr.length; i++) {
			
			if(arr[i].Department.equals(Dept)) {
				arr1[j]= arr[i];
			}
		}
		
		return arr;
	}

}
