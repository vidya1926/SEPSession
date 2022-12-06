package week1day2;

public class CheckTheAccess2 {	

	public static void main(String[] args) {

        int a = 0;
        int b = 1;
        // In this case both condition should true.
        // It will print the statement if both will be true
        if((a < 1) && (b < 2))
        {
            System.out.println("AND operation is executed");
        }
        // In this case first condition(a < 0) is false.
        // So it will not any print the statement
        if((a == 0) && (b < 2))
        {
            System.out.println("AND operation is executed");
        }
        // In this case only one condition should be true.
        // So it will print the statement
        if((a < 1) || (b < 0))
        {
            System.out.println("OR operation is executed");
        }
        
		
		
	}

}
