package org.mani.giftpackage;

import java.util.Comparator;

public class ItemCombinationsCostComparator implements Comparator<ItemCombinations>{

	@Override
	public int compare(ItemCombinations o1, ItemCombinations o2) {
		return o2.getCost() > o1.getCost() ? 1 : (o2.getCost() == o1.getCost()) ? 0 : -1 ;
	}

}
