package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public void printMyHobbies(String [] hobbies) {
		System.out.print("my hobbies are ");
		for(int i=0; i<hobbies.length;i++) {
			System.out.print(hobbies[i]);
			if(i < hobbies.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println(".");
	}
	
	public static Set RemoveDuplicateElement(String array[]) {
		
        Set <String>set = new HashSet<>();
        for (String element : array) {
            set.add(element);
        }
        return set;
    }
	
	public static void main(String[] args) {
		
		String hobbies[]= {"cycling", "dancing", "cooking", "dancing"};
		
		Main main = new Main();
		Set<String> set = RemoveDuplicateElement(hobbies);
		String[] mySet = new String[set.size()];
        set.toArray(mySet);
        main.printMyHobbies(mySet);
		
	
		}
	
}

