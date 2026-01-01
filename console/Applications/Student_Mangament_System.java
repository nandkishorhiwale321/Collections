package console.Applications;
import java.util.*;
import java.util.Scanner;

/*
 * This Console App of Student Mangament System.
 * Here I Am Using Classes & Objects ArrayList,Scanner,Switch Case, Loops,Methods and Iterator
 */

public class Student_Mangament_System {
	
		static ArrayList<App> app = new ArrayList<App>();
		static Scanner sc = new Scanner(System.in);
		
		public static void main (String [] args) {
			
		
		while(true) {
			System.out.println("\n1. Add Student..");
			System.out.println("2. View Student");
			System.out.println("3. Search Student");
			System.out.println("4. Dedete Student");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choise: ");
			int choise = sc.nextInt();
		
		switch(choise) {
		case 1: addStudent();
		         break;
		case 2: viewStudent();
		         break;
		
		case 3: searchStudent();
		           break;
		
		case 4: deleteStudent();
		          break;
		case 5: {
			System.out.println("Thank you");
			System.exit(0);
			
		}
		
		default : System.out.println("Invalid  Choise...!");
		
		}
		
		
		}
	}



 static void addStudent() {
	 System.out.println("Enter ID: ");
	 int id =sc.nextInt();
	 sc.nextLine();
	 
	  System.out.println("Enter Name: ");
	  String name = sc.nextLine();
	  
	  System.out.println("Enter Marks: ");
	  double marks = sc.nextDouble();
	    
	  
	  app.add(new App( name, id, marks));
	  System.out.println("Student successfully added");
	 
 }
     static void viewStudent() {
    	 
    	 if(app.isEmpty()) {
    		 System.out.println("No student found ");
    		 return;
    		 
    	 }
    	 
    	 
    	 for(App a : app) {
    		 System.out.println(a.name+" "+a.id+" "+a.marks);
    		 
    	 }
     }
     
     static void searchStudent() {
    	 
    	 System.out.println("Enter Id:");
    	 int id = sc.nextInt();
    	 
    	 for(App a : app) {
    		 if(a.id == id){
    			 
    			 System.out.println("Found: "+a.id+" "+a.name+" "+a.marks);
    			 return;
    			 
    		 }
    	 }
    	 
    	 System.out.println("Not found...........");
     }
     static void deleteStudent() {
    	 System.out.println("Enter ID: ");
    	 int id = sc.nextInt();
    	 
    	 Iterator <App> itr =  app.iterator();
    	 
    	 while(itr.hasNext()) {
    		 if(itr.next().id==id) {
    			 itr.remove();
    			 System.out.println("Student deleted");
    			 return;
    			 
    			 
    		 }
    	 }
    	 
    	 System.out.println("Student not found");
     }
     
 }
class App {
	
	String name;
	int id;
	double marks;
	
	public App(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
}
