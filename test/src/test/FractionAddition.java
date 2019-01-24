package test;

public class FractionAddition {

	public static void main(String[] args) {
		int number_1 = 1, denominator_1 = 5, number_2 = 2, denominator_2 = 15;
		System.out.println("Given : "+number_1 + "/" + denominator_1 + " + " + number_2 + "/" + denominator_2 + "  ");
		addFraction(number_1, denominator_1, number_2, denominator_2);

	}

	private static void addFraction(int number_1, int denominator_1, int number_2, int denominator_2) {

		int denominator_3 = gcd(denominator_1, denominator_2);
		System.out.println(
				"Greates Common Division of " + denominator_1 + " and " + denominator_2 + " is : " + denominator_3);

		denominator_3 = lcm(denominator_1, denominator_2, denominator_3);
		System.out.println(
				"Least Common multiple of " + denominator_1 + " and " + denominator_2 + " is : " + denominator_3);

		int number_3 = (number_1) * (denominator_3 / denominator_1) + (number_2) * (denominator_3 / denominator_2);
		System.out.println(number_3 + "= (" + number_1 + ")*(" + denominator_3 + "/" + denominator_1 + ") + ("
				+ number_2 + ")*(" + denominator_3 + "/" + denominator_2 + ")");

		// convert into simplest form
		System.out.println( number_3 + ", "+ denominator_3);
		form(number_3, denominator_3);
	}

	private static void form(int number_3, int denominator_3) {

		// Finding gcd of both terms
		int common_factor = gcd(number_3, denominator_3);

		denominator_3 = denominator_3 / common_factor;
		number_3 = number_3 / common_factor;
		System.out.println(number_3 + "/" + denominator_3);
	}

	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	private static int lcm(int a, int b, int gcd) {
//		lcm*gcd = a*b
		return (a * b) / gcd;
	}
}
