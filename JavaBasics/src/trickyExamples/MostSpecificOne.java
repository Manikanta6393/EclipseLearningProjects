package trickyExamples;

public class MostSpecificOne {
	public MostSpecificOne(Object o){
		System.out.println("Objecy");
	}
	
	public MostSpecificOne(String s){
		System.out.println("String");
	}
	
	void method(Integer i){
		System.out.println("Integer");
	}
	
	void method(String s){
		System.out.println("String");
	}

	public static void main(String[] args) {
		MostSpecificOne mo = new MostSpecificOne(null);
		//mo.method(null); //confusing as both are same level
	}

}
