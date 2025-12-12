package vector;
import java.util.Vector;

public class First {
	public static void main(String [] args) {
		
	Vector <Student> S =new Vector <Student>(); 
	Student s1 =new Student("Nandkishor",101,"18/10/2025","A+","nanda@mail.com");
	Student s2 =new Student("Ritesh",102,"22/02/2023","O+","ritesh234@mail.com");
	Student s3 =new Student("Ritesh",102,"22/02/2023","O+","ritesh234@mail.com");

	S.add(s1);
	S.add(s2);
	S.add(s3);
	System.out.println(S);

	System.out.println("Total Size before removing :"+S.size());
	S.remove(2);
	
	System.out.println(S);
	System.out.println("Total size After Removing :"+S.size());
	
	System.out.println(s2.equals(s3));
	System.out.println("hashcode of s2 :"+s2.hashCode());
	System.out.println("hashcode of s3 :"+s3.hashCode());
	
	System.out.println("The capacity of vecter is :"+S.capacity());
	
	
	
	}

}
class Student {
	
    String Name;
    int RollNumber;
    String DOB;
    String BloadGroup;
    String mail;
    
    Student(String Name, int RollNumber,String DOB,String BloadGroup, String mail){
    	
    	
    	this.Name=Name;
    	this.RollNumber=RollNumber;
    	this.DOB=DOB;
    	this.BloadGroup=BloadGroup;
    	this.mail=mail;
    	
    	
    }
    
    public String toString() {
		return "("+"Name :"+Name+", Roll Number :"+RollNumber+", DOB :"+DOB+", Bload Group :"+BloadGroup+", mail :"+mail+")";    	
    }
}