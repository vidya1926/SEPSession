package exceptionhandling;

public class LearnThrow2 {

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

		LearnThrow2 lt = new LearnThrow2();
		int divide = lt.divide(12, 10);
		System.out.println(divide);
		
	int random =(int) (Math.random() *999999);
	

		System.out.println(random);

	}

}
