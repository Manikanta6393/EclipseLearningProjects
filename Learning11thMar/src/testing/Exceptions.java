package testing;

public class Exceptions {
	public void abc() throws NullPointerException{
		NullPointerException e = new NullPointerException();
		throw e;
	}

	public static void main(String[] args) {
		int array[]={1,2,3,4,5};
		try{
			Exceptions obj = new Exceptions();
			obj.abc();
		}
		catch(Exception ne){
			System.out.println(ne.getMessage());
		}
		finally{
		}
	}

}
