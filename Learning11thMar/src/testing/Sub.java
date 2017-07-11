package testing;

class B {
	public B(){}
	public B(String ss){
		System.out.println("Defa");
	}
	
}
class Sub extends B{
	public Sub(){
		
	}
	public static void main(String[] args) {
		Sub bb = new Sub();

	}

}
