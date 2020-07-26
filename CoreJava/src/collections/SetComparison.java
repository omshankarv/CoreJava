package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparison {
public static void main(String args[])
{
	HashSet<String> gadgetStore=new HashSet<String>();
	LinkedHashSet<String> gadgetMarket=new LinkedHashSet<String>();
	TreeSet<String> gadgetCart=new TreeSet<String>();
	
	for(String gadget: Arrays.asList("smartphone","Tablet","smartwatch")) {
		gadgetStore.add(gadget);
		gadgetMarket.add(gadget);
		gadgetCart.add(gadget);
	}	
		/* what happens if you add a duplicate element above?*/
		
		//no ordering in Hashset - elements stored in random order
		System.out.println("Ordering in HashSet:"+gadgetStore);
		
		//insertion order or elements - LinkedHashSet stored elements in order of insertion
		System.out.println("Order of elements in Linked Hash Set:"+ gadgetMarket);
		
		//should be sorted order - TreeSet stores element in sorted order
		System.out.println("Order of objects in TreeSet"+gadgetCart);
		
		System.out.println("gadgetBuzz contains smartwatch:"+ gadgetCart.contains("smartwatch"));
		System.out.println("gadgetMarket contains Fitbit:"+gadgetMarket.contains("Fitbit"));
	}
}

