package enums;

public class Day {
	
	public static void main(String[] args){
		Names topper = Names.BENNY;
		Names topper2 = Names.valueOf("MANI");
		//for(Names n : Names.values())
		System.out.println(topper2.ordinal());
	}

}
