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
				/**/
				String originString = input;
				
				if(originString.equals(input.toUpperCase())) {
					string.append(input);
					string.append(" !");
				}else {	
					string.append(input.substring(0, 1).toUpperCase());
					string.append(input.substring(1));
				}
				break;
		}
		return string.toString();
	}

}
