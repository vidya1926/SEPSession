package week1day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++)
		{			// System.out.println(i);
			if (i == 3) {
				// break;-->stops the execution
				continue;// skip the satisfied condition and execute the other part of the loop
			}
			System.out.println(i);
		}
	}

}
