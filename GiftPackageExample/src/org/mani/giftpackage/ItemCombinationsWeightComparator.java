package org.mani.giftpackage;

import java.util.Comparator;

public class ItemCombinationsWeightComparator implements Comparator<ItemCombinations>{

	@Override
	public int compare(ItemCombinations o1, ItemCombinations o2) {
		return o1.getWeight() > o2.getWeight() ? 1 : (o1.getWeight() == o2.getWeight()) ? 0 : -1 ;
	}

}
