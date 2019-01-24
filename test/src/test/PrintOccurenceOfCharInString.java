package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOccurenceOfCharInString {

	public static void main(String[] args){ 
        String str = "AAAaabbc"; 
        characterCount(str); 
    }

	private static void characterCount(String str) {

		Map<Character, Integer> countMap = new LinkedHashMap<>();
		
		char[] strArray = str.toCharArray();
		
		for(int i =0;i<str.length();i++) {
			
			countMap.computeIfPresent(strArray[i], (k,v) -> v+1);
			countMap.computeIfAbsent(strArray[i], v -> 1 );
		}
		countMap.forEach((key, value) -> {
		    System.out.print(key+""+value);
		});
	} 

}
