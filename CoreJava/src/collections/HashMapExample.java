package collections;

import java.util.HashMap;
import java.util.Random;

public class HashMapExample {
public static void main(String[] args) {
	
	//Create a hashmap object
	HashMap<String,Long> employees = new HashMap<String, Long>();
	
	//Add Keys values (name, ID)
//	employees.put("Varun", new Random().nextLong() & Long.MAX_VALUE);
//	employees.put("Sarah", new Random().nextLong() & Long.MAX_VALUE);
//	employees.put("Shakir", new Random().nextLong() & Long.MAX_VALUE);
	
	employees.put("Varun", (long) 1);
	employees.put("Sarah", (long) 2);
	employees.put("Shakir", (long) 3);
	employees.put("Shakir", (long) 4);
	
	System.out.println("Varun's employee ID is:"+employees.get("Varun"));
	
	for(String i:employees.keySet()) {
		System.out.println("Key: "+i+"Value:" + employees.get(i));
	}
	
	// display size of hash map
	System.out.println("Total Hash Map values :"+employees.size());
	

	//change hash map key value for employee Varun
	employees.replace("Varun", (long) 200);
	
	// Print after key value change
	for(String i:employees.keySet()) {
		System.out.println("Key: "+i+"Value:" + employees.get(i));
	}
	
	// remove all items using clear
	employees.clear();
	
	System.out.println("After clearning, the hashmap's size is "+employees.size());
	
	}
		
}

