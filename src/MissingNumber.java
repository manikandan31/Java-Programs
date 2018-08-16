
public class MissingNumber {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,5,6,7,8};
		
		for(int i =0; i< a.length-1; ) {
			
			if (a[i++]+1==a[i]) {
				
			}
			else {
				System.out.println("missing number is   "+(i+1));
			}
			
		}
		
		int sum1=0,sum2=0;
		
		for (int j=0; j<a.length ; j++) {
			sum1=sum1+a[j];
		}
		
		System.out.println(sum1);
		
		for (int k=a[0] ; k<=a[ a.length-1] ;k++) {
			sum2= sum2 + k;
			
		}

		System.out.println(sum2);
		
		System.out.println("Missing number is "+(sum2-sum1));
	}

}
