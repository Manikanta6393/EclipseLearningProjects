package test;

public class Test1 {
	private Test1(){
		System.out.println("Hello");
	}
	public Test1(String name){
		System.out.println("Hello "+name);
	}

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test1 abcd = new Test1();
		//Test1 abcd2 = new Test1("Mani");
		Student mani = new Student(1,"Mani");
		mani.toString();
	}

}
