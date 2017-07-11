package org.mani.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mani.giftpackage.Item;
import org.mani.giftpackage.ItemCombinations;
import org.mani.giftpackage.ItemCombinationsCostComparator;
import org.mani.giftpackage.ItemCombinationsWeightComparator;

public class FindCombination {

	public static final double PACKAGE_WEIGHT = 100;
	public static final int MAX_ITEMS_PER_PACKAGE = 15;
	public static final double MAX_WEIGHT_PER_ITEM = 100;
	public static final double MAX_COST_PER_ITEM = 100;

	public static List<String> Test_Cases = new ArrayList<>();

	public static void main(String... args){
		try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
			Map<Integer,List<Item>> mapAfterRemovingHeavyWeights = new HashMap<>();
			Map<Integer,List<ItemCombinations>> mapWithAllValidCombinations = new HashMap<>();

			String line = "";
			while((line = br.readLine()) != null){
				Test_Cases.add(line);
			}
			seperateEachTest(Test_Cases,mapAfterRemovingHeavyWeights);
			populateCombinations(mapAfterRemovingHeavyWeights,mapWithAllValidCombinations);
			System.out.println(mapWithAllValidCombinations);
			for(Map.Entry<Integer,List<ItemCombinations>> entry : mapWithAllValidCombinations.entrySet())
				if(entry.getValue().size()>0)
					System.out.println(entry.getKey()+" : "+ entry.getValue().get(0).getIndexCombination());
				else
					System.out.println(entry.getKey()+" : --");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void populateCombinations(Map<Integer,List<Item>> mapAfterRemovingHeavyWeights, Map<Integer,List<ItemCombinations>> mapWithAllValidCombinations) {
		
		for(Map.Entry<Integer,List<Item>> entry : mapAfterRemovingHeavyWeights.entrySet()){
			List<ItemCombinations> combinationsList = new ArrayList<>();
			Integer package_weight_limit = entry.getKey();
			
			for(int i =0; i < entry.getValue().size(); i++){
	           double weightSum = 0;
	           String indexeCombination="";
	           double moneySum = 0;
	            for(int j =i; j < entry.getValue().size(); j++){
	            	indexeCombination += String.valueOf(entry.getValue().get(j).getIndex()) + " " ;
	            	weightSum += entry.getValue().get(j).getWeight();
	            	moneySum += entry.getValue().get(j).getCost();
	                if(weightSum < PACKAGE_WEIGHT  && weightSum < package_weight_limit){
	                	ItemCombinations combination = new ItemCombinations();
	                	combination.setIndexCombination(indexeCombination);
	                	combination.setWeight(weightSum);
	                	combination.setCost(moneySum);
	                	combinationsList.add(combination);
	                }
	            }
	        }
				Collections.sort(combinationsList, new ItemCombinationsWeightComparator());
				Collections.sort(combinationsList, new ItemCombinationsCostComparator());
				mapWithAllValidCombinations.put(package_weight_limit, combinationsList);
		}
		
	}

	public static void seperateEachTest(List<String> list,Map<Integer,List<Item>> requiredMap) {
		Map<Integer,List<Item>> test_map = new LinkedHashMap<>(MAX_ITEMS_PER_PACKAGE);
		
		for(String testCases : list){
			String[] split_using_colon = testCases.split(":");
			test_map.put(Integer.valueOf(split_using_colon[0].trim()),getListOfStrings(split_using_colon[1].trim()));
		}


		for(Map.Entry<Integer,List<Item>> entry : test_map.entrySet()){
			//System.out.println(entry.getKey()+" == "+ entry.getValue().toString());
			List<Item> requiredList = new ArrayList<>();
			Integer package_weight_limit = entry.getKey();
			for(Item item: entry.getValue()){
				if(item.getWeight() < package_weight_limit){
					requiredList.add(item);
				}
			}
			requiredMap.put(package_weight_limit, requiredList);
		}
	}

	public static List<Item> getListOfStrings(String string) {
		List<Item> items = new ArrayList<>();
		String[] getStrings_from_givenLine = string.split(" ");
		for(String element : getStrings_from_givenLine){
			String item_details_string = element.trim();
			String eliminate_braces = item_details_string.substring(1,item_details_string.length() - 1);
			String[] split_item_elements =  eliminate_braces.split(",");
			Item item = new Item(Integer.valueOf(split_item_elements[0]),Double.valueOf(split_item_elements[1]),
														Double.valueOf(split_item_elements[2].substring(1)));
			items.add(item);
		}
		return items;
	}
}
