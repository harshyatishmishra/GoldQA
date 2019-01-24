package test;

public class RemoveExtraFromAnagram {

	final static int CHARS = 256; 
	  
    static int countDeletions(String str1, String str2) { 
        int arr[] = new int[CHARS]; 
        for (int i = 0; i < str1.length(); i++) { 
        	System.out.println(str1.charAt(i) +" "+ (str1.charAt(i) - 'a'));
//        	System.out.print(str1.charAt(i) +"");
            arr[str1.charAt(i) - 'a']++; 
        } 
        System.out.println();
        for (int i = 0; i < str2.length(); i++) {
        	System.out.println(str2.charAt(i) +" "+ (str2.charAt(i) - 'a'));
        	//System.out.print(str2.charAt(i) +"");
            arr[str2.charAt(i) - 'a']--; 
        } 
        System.out.println();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(arr[i] + " "+ Math.abs(arr[i])); 
        } 
  
        for (int i = 0; i < CHARS; i++) {
            ans += Math.abs(arr[i]); 
        } 
        return ans; 
    } 
  
    static public void main(String[] args) { 
        String str1 = "bcadeh", str2 = "hea"; 
        System.out.println(countDeletions(str1, str2));
        System.out.println();
    } 

}
