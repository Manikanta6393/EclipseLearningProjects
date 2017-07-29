package examples;

public class A {
	int x=10;
	A(){}
	public void assign(int x){
		//x=x;
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		new A().assign(100);

	}

}
