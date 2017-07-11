package org.mani.giftpackage;

public class ItemCombinations {
	
	private String indexCombination;
	private double weight;
	private double cost;
	
	public ItemCombinations(){
	}
	
	public ItemCombinations(String indexCombination, double weight, double cost) {
		super();
		//System.out.println("Arguments Constructor invoked!");
		this.indexCombination = indexCombination;
		this.weight = weight;
		this.cost = cost;
	}

	public String getIndexCombination() {
		return indexCombination;
	}

	public void setIndexCombination(String indexCombination) {
		this.indexCombination = indexCombination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Element [indexCombination=" + indexCombination + ", weight=" + weight + ", cost="
				+ cost + "]";
	}

}
