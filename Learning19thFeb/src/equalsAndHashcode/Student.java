package equalsAndHashcode;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("rawtypes")
public class Student implements Comparable{
int admissionCode;
String studentName;
int marks;

public Student(int admissionCode,String studentName,int marks){
this.admissionCode= admissionCode;
this.studentName=studentName;
this.marks=marks;
}
public String toString(){
	return studentName;
}

@Override
public int compareTo(Object object) {
	Student that = (Student)object;
	if(this.marks< that.marks)
		return -1;
	else if(this.marks> that.marks)
		return -1;
	else
		return 0;
}

@SuppressWarnings("unchecked")
public static void main(String [] args){

Student stu1 = new Student(8,"Jones",80);
Student stu2 = new Student(10,"Anand",90);
Student stu3 = new Student(1,"Mani",70);
Student stu4 = new Student(15,"Vamshi",50);
ArrayList<Student> slist = new ArrayList<>();

slist.add(stu1);
slist.add(stu2);
slist.add(stu3);
slist.add(stu4);

System.out.println(slist);

Collections.sort(slist);

System.out.println(slist);

}

}