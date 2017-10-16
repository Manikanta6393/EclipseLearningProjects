package org.mani.basics;

public class InfinteConstructor {

	public InfinteConstructor() {
		new InfinteConstructor();
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//InfinteConstructor ab = InfinteConstructor.class.newInstance();
		Class.forName("org.mani.basics.InfinteConstructor").newInstance();
		System.out.println("End");

	}

}
