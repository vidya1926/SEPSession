import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		
		int[] a= {11,14,2,6,18,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i]+1)
			{//2=a[0] +1==>2=3
				continue;
			}
			else {
				for(int j=a[i]+1;j<a[i+1];j++) {
					System.out.println(j);
				}
				
			}
					
		}
		
		
		
		
		
		/*int length = a.length;
		System.out.println(length);
		for(int i=1;i<=a.length;i++) {
			
			if(i!=a[i-1]) {
				//5 ==>a[5-1] ==>6
				//6==>a[6-1]=>7
				
				System.out.println(i);
				*/
			
		
		
		//i=1
		//arr[index]=0
		
		
		
		
		// TODO Auto-generated method stub

	}

}
