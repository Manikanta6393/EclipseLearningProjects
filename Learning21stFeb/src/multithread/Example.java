package multithread;
class Example {

	public Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int number[] = new int[5];
int b;
	for (int i=0;i<6;i++){
		System.out.println("number["+i+"]"+ number[i]);
		Runtime.getRuntime().gc();
	}
	}

}
