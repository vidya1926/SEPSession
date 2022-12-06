import java.util.Arrays;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Test 12";
	//	["Test","12"];
		
		String[] split = s.split("1");
		System.out.println(Arrays.toString(split));
		
		System.out.println(split[1]);
		
	}

}
