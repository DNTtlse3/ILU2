package welcome;

import java.security.MessageDigest;

public class Welcome {
	
	public static String welcome(String input) {
		
		StringBuilder string = new StringBuilder();
		
		string.append("Hello, ");
		
		/**/
		switch((input != null)?(input.trim().length()): 0) {
		
			case 0: string.append("my freind");
					break;
			default:
				
				String lesNoms[] = input.split(",");
				
				string.append(reponse(lesNoms));
				
				break;
		}
		return string.toString();
	}
	
	
	private static String reponse(String lesNoms[]){
		
		StringBuilder string = new StringBuilder();
		
		for(int k = 0; (k < lesNoms.length); k++) {
			
			if(lesNoms[k].equals(lesNoms[k].toUpperCase())) {
				string.append(lesNoms[k]);
				string.append(" !");
			}else {
				string.append(lesNoms[k].substring(0, 1).toUpperCase());
				string.append(lesNoms[k].substring(1));
				
				if((k + 1) % lesNoms.length != 0) string.append(", "); 
			}
		}
		
		return string.toString();
		
	}
}
