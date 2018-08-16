import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String string1;
		System.out.print("Enter the string value to br reversed :");
		
		Scanner sc = new Scanner(System.in);
		string1 = sc.next();
		System.out.println("Before Reverse :"+string1);
		String temp = "";
		
		for(int i=string1.length(); i>0 ; i--) {
			
			temp = temp + string1.charAt(i-1);
			
		}
		
		System.out.println("After Reverese : " +temp);
		
		StringBuffer sb = new StringBuffer(string1);
		System.out.println("After reverse br String buffer :" +sb.reverse());
		sc.close();

	}

}
