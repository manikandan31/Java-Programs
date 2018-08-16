import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String string[] = { "Selenium", "QTP", "Protractor", "Selenium", "SoapUI", "REST", "QTp"};
		
		for(int i=0; i<=string.length-1; i++) {
			
			for (int j=i+1; j<string.length; j++) {
				if(string[i]==string[j])
				{
					System.out.println("Duplicate element in array :" +string[i]);
				}
			}
		}
		
		System.out.println("--------------------------------------------------");
		Set <String> store = new HashSet<String>();
		
		for(String string1 : string) {
			if(store.add(string1)==false) {
				System.out.println("Duplicate element in array :" +string1);
			}
		}
		
	}

}
