package constructor;

public class Example {
	Example(){};
	public void print(int no, int count){
		System.out.println("Number: "+no);
	}
	public boolean print(double count, int no){
		System.out.println("Number: "+no);
		return true;
		
	}
	
	public static void main(String[] args){
		Example ex = new Example();
	}

}
