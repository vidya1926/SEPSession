package week3day1;

public class LearnParseInt {

	public void call() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String price="Rs 2000";
		String replace = price.replace("Rs", "");
		String trim = replace.trim();
	    System.out.println(trim+100);
	    //to convert a string into integer
		int rate = Integer.parseInt(trim);
		rate=rate+100;
		System.out.println(rate);
		
		
		

	}

}
