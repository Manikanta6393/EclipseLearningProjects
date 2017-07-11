package enums;

class EnumDemo{
	public static void main(String args[]) {
		double x = Double.parseDouble("2");
		double y = Double.parseDouble("3");       

		for(Operation op : Operation.values()){
			System.out.printf("%f %s %f = %f%n", x, op, y,  op.evaluate(x, y));
		}
	}}


