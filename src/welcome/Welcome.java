package welcome;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder string = new StringBuilder();
		string.append("Hello, ");
		string.append(input.substring(0, 1).toUpperCase());
		string.append(input.substring(1));
		return string.toString();
		
		
	}

}
