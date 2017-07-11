package testing;

public class MultipleExceptionExample {

	public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[8] = 30/1; 
            int e = 011_1;  
            System.out.println("e = "+e);
            
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ 
        	//int e = 1002;
            System.out.println(e.getMessage());  
        }    
     }    

}
