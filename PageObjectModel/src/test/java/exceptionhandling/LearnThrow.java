package exceptionhandling;

public class LearnThrow {

	public int divide(int n1, int n2) {
		int z;
		if (n1 < n2) {
			throw new ArithmeticException("Check your input");
		} else {
			z = n1 / n2;
		}
		return z;

	}

	public static void main(String[] args) {

		LearnThrow lt = new LearnThrow();
		int divide = lt.divide(12, 10);
		System.out.println(divide);

	}

}
