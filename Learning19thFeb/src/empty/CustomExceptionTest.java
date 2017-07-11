package empty;

public class CustomExceptionTest {
public static void main(String[] args) {
int age = -1; 
if (age < 0){ 
try {
   throw new NegativeAgeException();
} 
catch (NegativeAgeException e) {
System.out.println(e);
} 
}else{
 System.out.println("Age entered is " + age); } 
}
}

