package schoolmangement;
import java.util.Scanner;
import entity.Person;
import entity.Student;
import entity.Teacher;
public class Menu {
	
	static int option;
	static int stuoption;
	static int teacheroption;
	
	public void option() {
		Student[] array = null;
		Student stu= new Student();
		Teacher[] arr=null;
		Teacher tea=new Teacher();
		Scanner sc=new Scanner(System.in);
	
		int num=0;
		do {
			System.out.println("1. Student");
			System.out.println("2. Teacher");
			System.out.println("3. Exit");
			System.out.println("choose one option");
			option=sc.nextInt(); 
			switch(option) {
			case 1:
					System.out.println("1.Insert Student Record");
					System.out.println("2.View Student Record");
					System.out.println("3.Search Student Record by Roll No");
					System.out.println("4.Search Student Record by Course Name");
					System.out.println("5.Exit");
					
					stuoption=sc.nextInt();
				
					switch(stuoption) {
					case 1: 
						System.out.println("Enter How Many Records To Insert");
						num=sc.nextInt();
						array=new Student[num];
						for(int i=0; i<num;i++) {
							array[i]=new Student();
							array[i].insert();

						}
						
					break;
							
					case 2: 
						for(int i=0 ;i<num ;i++) {
						array[i].display();
						}
					break;
						
						
							
					case 3:
						
					
						System.out.println(" Enter Roll No ");
						int Rno =sc.nextInt();
					
						
						Student  student = stu.SearchByRollNo(array ,Rno );
						
						if(student == null) 
						{
							System.out.println("No record found");
						}
						 
						else 
						{
							student.display();
						}
					
					break;
					
					case 4:
						
						System.out.println("Enter Course Name");
						String Course=sc.next();
				
						
						Student[] students=stu.SearchByCourseName(array, Course);
						for(int i=0; i<students.length;i++) {
						if(students[i]==null) {
							System.out.println("No record found");
						}
						else {
							students[i].display();
						}
						}
					break;
					
					case 5:
						System.out.println("Thank you");
						break;
						
						
						
						
					}
			break;
			
			case 2:
					System.out.println("1.Insert Teacher Record");
					System.out.println("2.View Teacher Record");
					System.out.println("3.Search Teacher Record by Department");
					System.out.println("4.Search Teacher Record by Teacher Id");
					System.out.println("5.Exit");
					teacheroption=sc.nextInt();
				

					switch(teacheroption) {
					case 1:
						System.out.println("how many records you want to insert");
						num=sc.nextInt();
						arr=new Teacher[num];
						for(int i=0; i<num;i++) {
							arr[i]=new Teacher();
							arr[i].insert();
						
						}
					break;
						
					case 2:
						for(int i=0; i<num;i++) {
							arr[i].display();
						}
						
					break;
						
					case 3:
						System.out.println("Enter Department");
						String dept=sc.next();
						
						Teacher[] teachers=tea.SearchByDepartment(arr, dept);
						for(int i=0;i<teachers.length;i++) {
						if(teachers[i] == null) {
							System.out.println("No Matched Record");
						}
						else {
							teachers[i].display();
						}
						}
					break;	
					
					case 4:
						System.out.println("Enter Teacher Id");
						int Tid=sc.nextInt();
				
						
						Teacher teacher=tea.SearchById(arr, Tid);
						
						if(teacher == null) {
							System.out.println("No Matched Record");
						}
						else {
							teacher.display();
						}
						
					case 5:
						System.out.println("Thank you");
						break;
					}
			break;
			
			case 3:
				System.out.println("Thanks for Your Respose.");
				System.exit(0);
		
			
			}
		}while(option>0);
		
	}
}

			
			
				
			
			
			
		
		
	
	
