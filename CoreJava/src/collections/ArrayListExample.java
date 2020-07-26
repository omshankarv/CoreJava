package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
public static void main(String args[]) {
	ArrayList<String> cameras=new ArrayList<String>();
	cameras.add("Nikon");
	cameras.add("Panasonic");
	cameras.add("Canon");
	cameras.add("Sony");
	
	System.out.println("Size of our array list is"+cameras.size());
	System.out.println("First Element in the list is :"+cameras.get(0));
	
	System.out.println("Before sorting======");
	for(String i:cameras) {
		System.out.println(i);
	}
	
	Collections.sort(cameras);
	
	System.out.println("After Sorting========");
	for(String i:cameras) {
		System.out.println(i);
	}
	//replace 2nd element
	cameras.set(1, "Konica");
	
	System.out.println("cameras");
}
}
