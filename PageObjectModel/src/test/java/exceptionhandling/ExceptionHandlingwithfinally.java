package exceptionhandling;

public class ExceptionHandlingwithfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=0;
		int z;
		int[] a= {1,2,3,4};
		String s;
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println(e);}
		finally {
			
		System.out.println("Last line of code");
	
		}
		
			/*try {		
				System.out.println(x/y);
				throw new Exception();
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(x/y);
		}*/
		
		
	}		
		
		
		
	
		
	

}
