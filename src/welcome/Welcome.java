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
				string.append(input.substring(0, 1).toUpperCase());
				string.append(input.substring(1));
				break;
		}
		return string.toString();
	}

}
