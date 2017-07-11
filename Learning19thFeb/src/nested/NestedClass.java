package nested;

public class NestedClass {
	public static int number=80;
	public String name="Manikanta";
	
	public static class InnerClass{
		public String toString(){
			NestedClass nc= new NestedClass(); 
			return "Name : "+nc.name+" :: Number : "+number;
		}
	}
	
	public class SecondInnerClass{
		public String toString(){
			return "Name : "+name+" :: Number : "+number;
		}
	}
	
	public static void main(String[] args){
		/*NestedClass nc= new NestedClass();	
		System.out.println(nc);*/
		NestedClass.InnerClass nc = new NestedClass.InnerClass();
		InnerClass ic = new InnerClass();
		System.out.println(nc);
	}

}
