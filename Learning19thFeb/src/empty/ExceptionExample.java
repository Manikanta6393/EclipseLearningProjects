package empty;

public class ExceptionExample {

	public static void main(String[] args){
		int i=0;
		try{
			int k=12/i;
			System.out.println("Printing k");
		}catch(Exception ex){
			ex.printStackTrace();;
		}
	}

}
