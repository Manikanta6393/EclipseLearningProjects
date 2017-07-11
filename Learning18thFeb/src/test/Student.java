/**
 * 
 */
package test;

/**
 * @author Manikanta
 *
 */
public class Student {

	private int rollno;
	private String name;
	private static String schoolName;
	
	static{
		System.out.println("Intialsing");
	}
	
	Student(){// default constructor  
	     this.rollno=0;
	     this.name ="";
	}
	Student(int rollno){  // 1-arg constructor
	    this.rollno =rollno;
	}
	// 1-arg constructor
	Student(String name){
	    this.name = name;
	}
	// 2-arg constructor
	Student(int rollno, String name)
	{
	 this.rollno = rollno;
	 this.name = name;
	}
	
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public int getRollno (){
		 return rollno;
		}
	
	public String getName(){
		return name;
	}
	public void setRollno(int rollno){
		this.rollno=rollno; }
	
	
	public static void main(String[] args){
		Student   s1 =  new Student();
		Student   s2 = new Student("John");
		Student  s3 = new Student (1);
		Student  s4 = new Student(2,"Laxmi");
		Student.setSchoolName("HPS");
		System.out.println(s4.getName()); 

	}
	}



