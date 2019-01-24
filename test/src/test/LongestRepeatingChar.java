package test;

/*
 * Given a String, find the longest first repeating index and its length.
 * (Input: “aabbbbddccccc”  Output: [8,5] 8 is the index and 5 is the length).
 */
public class LongestRepeatingChar {

	public static void main(String[] args) {
		String str = "aabbbbddccccc";
		System.out.println(maxRepeating(str));
	}

	private static char maxRepeating(String str) {
		int n = str.length();
		int count = 0;
		char res = str.charAt(0);
		int cur_count = 1;
		int curr_index = -1;
		int index = -1;
		for (int i = 0; i < n; i++) {

			if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				cur_count++;
				if (curr_index == -1) {
					curr_index = i;
				}
			} else {
				if (cur_count > count) {
					count = cur_count;
					res = str.charAt(i);
					index = curr_index;
				}
				cur_count = 1;
				curr_index = -1;
			}
		}
		System.out.println("[" + index + "," + count + "]");
		return res;
	}

}
