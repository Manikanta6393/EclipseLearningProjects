package trickyExamples;

class Cat{
	public String name= "Mani";
	public static void meow(){
		System.out.println("Meow");
	}
}

class Munchkin extends Cat{
	private String name2= "Manikanta";
	public static void meow(){
		System.out.println("Yown");
	}
}

public class CatUtil {
	

	public static void main(String[] args) {
		Cat kitty = new Cat();
		Cat munchkin = new Munchkin();
		kitty.meow();
		munchkin.meow();
		System.out.println(new Munchkin().name);
	}

}
