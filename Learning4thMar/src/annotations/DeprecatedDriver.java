package annotations;

@SuppressWarnings("deprecation")
class DeprecatedDriver{
	public static void main(String [] args){
		DeprecatedTest test = new DeprecatedTest(10);
		test.show();   
		System.out.println(test);
	}
}

