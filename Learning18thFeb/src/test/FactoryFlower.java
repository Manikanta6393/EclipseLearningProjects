package test;

public class FactoryFlower {
	 private String flowerName;
	private static FactoryFlower  instance = null;
	private FactoryFlower() { 	}
	
	static FactoryFlower getInstance(){
		if(instance == null){
			instance = new FactoryFlower();
		}
		return instance;
	}
	 public String getFlowerName(){
	       return flowerName;
	      }
	 public void setFlowerName(String flowerName){
		this.flowerName = flowerName;
	      }
	
	 public static void main(String[] args) {
		 FactoryFlower obj1 = FactoryFlower.getInstance();
		 obj1.setFlowerName("Rose");
		 System.out.println(obj1.getFlowerName());
		 FactoryFlower obj2 = FactoryFlower.getInstance();
		 System.out.println(obj1);
		 System.out.println(obj2);;
		 }
}
