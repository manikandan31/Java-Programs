
public class SwapString {

	public static void main(String[] args) {
	
		String s1="Mani", s2="Kandan";
		
		s1=s1+s2;
		
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping strings: First String - "+s1+"   Second String -"+s2);

	}

}
