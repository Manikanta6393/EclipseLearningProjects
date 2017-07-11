package nested;

public class InnerAndAnonymous {
	
	public void print(){
		System.out.println("Outer Print");
		class Inner{
			private void innerprint() {
				System.out.println("Inner Print");
			}
		}
	}
	public static void main(String[] args){
		InnerAndAnonymous iAC = new InnerAndAnonymous();
		iAC.print();
	}

}
