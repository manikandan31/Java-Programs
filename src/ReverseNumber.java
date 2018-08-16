import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,reverse=0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer to be reversed : ");
		number =sc.nextInt();
		temp = number;
		while(number>0) {
			reverse= reverse*10+number%10;
			number= number/10;
			
		}
		
		System.out.println("After Reversing of Integer : "+reverse);
		
		//StringBuffer sb =new StringBuffer()
		
		 
		System.out.println(new StringBuffer(String.valueOf(temp)).reverse());

	}

}
