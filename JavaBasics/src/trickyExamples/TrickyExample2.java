package trickyExamples;

public class TrickyExample2 {
	public static void main(String args[]){
		System.out.println(T.x);
	}

}

class T{
	public static final int x = 100;
	
	static{
		System.out.println("T loaded");
	}
}
