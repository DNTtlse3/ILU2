package welcome;

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
				break;
		}
		return string.toString();
	}
}
