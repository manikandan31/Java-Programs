
public class RemoveJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="!@#$%&*()  test string 1234 #$",s;
		s =s1.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);

	}

}
