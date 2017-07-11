package empty;

public class AgeVerification{
private int age;
public void setAge(int age) throws IllegalArgumentException {
 if (age < 0) 
  throw new IllegalArgumentException("Age must be > 0");
 else{
  System.out.println("Valid Age");
  this.age = age;}
 }
public int getAge(){ return age;}
public static void main(String [] args) {
 AgeVerification obj = new AgeVerification();
 obj.setAge(5);
 System.out.println(obj.getAge()); 
 try{
 obj.setAge(-5);
 System.out.println(obj.getAge());
}
catch(IllegalArgumentException ie){System.out.println(ie); } } }
