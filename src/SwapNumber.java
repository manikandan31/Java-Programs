
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=8;
		
		System.out.println("Before Swap: First Number -"+a+"  Second Number -"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swap: First Number -"+a+"   Second Number -"+b);
	}

}
