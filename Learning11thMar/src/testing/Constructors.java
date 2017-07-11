package testing;


public class Constructors {
	String name;
	int id;
	protected Constructors() {
		System.out.println("Default");
	}
	public Constructors(String name,int id) {
		this.name= name;
		this.id=id;
		
	}
	public static void main(String[] args){
		Constructors c = new Constructors("Hi",1234);
		System.out.println(c.name+" "+c.id);
	}

}
