
public class SmallestLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,5,70,12,3,4};
		
		int smallest =a[0], largest =a[0];
		
		for(int i=1; i<= a.length-1;i++) {
			if(a[i]<smallest)
				smallest = a[i];
			if(a[i]>largest)
				largest=a[i];
		}
		System.out.println("Smallest in Array : " +smallest);
		System.out.println("largest in Array : " +largest);
	}

}
