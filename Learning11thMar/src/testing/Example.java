package testing;

public class Example {
	public static void main(String[] args) {
		
		String exp = "(* 2 (- 7 (+5 6 0 8) (/ 9 0) (* 9 3) 3) 4 5)";
		char EMPTY = 0;
		StringBuilder str = new StringBuilder();
		char temp=0;
		char[] chars = exp.replaceAll("\\s", "").toCharArray();
		//int size = chars.length;
		char[] tempArrays = new char[10];
		int i=0;
		for(char value : chars){
			switch (value){
			case '(' : str = str.append(value);i++;
			continue;
			case '+' : temp = value;tempArrays[i]=value;
			break;
			case '-' : temp = value;tempArrays[i]=value;
			break;
			case '*' : temp = value;tempArrays[i]=value;
			break;
			case '/' : temp = value;tempArrays[i]=value;
			break;
			case ')' : str=str.deleteCharAt(str.length() - 1);i--;temp = tempArrays[i];str = str.append(value).append(temp);
			continue;
 			}
			if(value != temp){
				if(temp != EMPTY){
				str = str.append(value).append(temp);
				}
			}
		}
		System.out.println(str.deleteCharAt(str.length() - 1));	
		
	} 
		

	

}
