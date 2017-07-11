package enums;

public enum Operation{ 
	PLUS {  double evaluate(double x, double y) { return x + y; } },  
	MINUS  { double evaluate(double x, double y) { return x - y; } },  
	TIMES  { double evaluate(double x, double y) { return x * y; } },  
	DIVIDE { double evaluate(double x, double y) { return x / y; } };  
	abstract double evaluate(double x, double y);
}

