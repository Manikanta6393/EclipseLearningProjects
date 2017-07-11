package string;

public class Duck {
	private int size;
	private static int duckCount;
	public Duck(){
		 duckCount++;
	}
	public void setSize (int s){
		this.size = s;
	}
	public int getSize (){
		return this.size;
	}
	public static void main(String args[]){
		System.out.println("Size of the duck is: " );
		Duck duck1 = new Duck();
		System.out.println(duck1.getSize());
		Duck duck2 = new Duck();
		Duck duck3 = new Duck();
		System.out.println(duckCount) ;  // duckCount
	} 
}
