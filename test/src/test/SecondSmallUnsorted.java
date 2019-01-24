package test;
/*
 * Find the second smallest elements in an unsorted array
 * 
 * Time Complexity: O(n)
 */
public class SecondSmallUnsorted {

	public static void main(String[] args) {
		int arr[] = { 90, 40, 60, 50, 70, 20 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		print2Smallest(arr);

	}

	private static void print2Smallest(int[] arr) {

		int first = 0, second = 0, arr_size = arr.length;

		if (arr_size < 2) {
			System.err.println("Invalid Input");
			return;
		}

		first = second = Integer.MAX_VALUE;
		System.out.println("First : " + first + " and Second : " + second);
		for (int i = 0; i < arr_size; i++) {

			System.out.println("Element number " + (i + 1) + " in array is : " + arr[i]);
			if (arr[i] < first) {
				System.out.println("Condition Check : "+arr[i] + " < " + first);
				second = first;
				first = arr[i];
				System.out.println("If block First : " + first + " and Second : " + second);
			} else if (arr[i] < second && arr[i] != first) {
				System.out.println("Condition Check : "+arr[i] + " < " + second + " && " + arr[i] + " != " + first);
				second = arr[i];
				System.out.println("elseIf block First : " + first + " and Second : " + second);
			}
		}

		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second smallest element");
		else
			System.out.println("The second smallest element is : " + second);
	}

}
