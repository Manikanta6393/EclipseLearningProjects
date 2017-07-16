package multithread;

public class ChangeIt {
	static void doIt(int[] z){
		int temp = z[4];
		z[0] = temp;
	}

	public static void main(String[] args) {
		String[] name =new String[0];
		int[] myArray = {1,2,3,4,5};
		ChangeIt.doIt(myArray);
		//Package p = new Package(null, null, null, null);
		
		for(int i=0;i<5;i++)
			System.out.print(myArray[i]+" ");

	}

}
