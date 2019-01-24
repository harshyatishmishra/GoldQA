package test;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(fibIteration(4));

		System.out.println(fibRecursion(4));
	}

	static int fibRecursion(int n) {
		if (n <= 1)
			return n;

		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	static int fibIteration(int n) {
		int a = 0, b = 1, c = 1;
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		for (int i = 0; i < n - 2; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}
}
