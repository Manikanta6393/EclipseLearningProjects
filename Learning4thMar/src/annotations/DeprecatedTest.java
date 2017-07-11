package annotations;

class DeprecatedTest{
	int x;
	DeprecatedTest(int x){this.x=x;}

	@Deprecated
	void show() {
		System.out.println(x);
	}
	public String toString() {
		return  "x = " + x;
	}
	
}

