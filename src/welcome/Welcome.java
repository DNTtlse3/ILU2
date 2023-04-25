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
				
				/*On filtre input*/
				
				String messageFiltrer = pretraitementMessage(input);
				
				string.append(reponse(messageFiltrer));
				break;
		}
		return string.toString();
	}
		
	private static String reponse(String lesNoms){
		/*Pour les noms en miniscule*/
		StringBuilder s1 = new StringBuilder();
		
		/*Pour les noms en majuscule*/
		StringBuilder s2 = new StringBuilder();
		
		for(String prenom : lesNoms.split(",")) {	
			if(prenom.equals(prenom.toUpperCase())) {
				s2.append(prenom);
				s2.append(",");
			}else {
				s1.append(prenom);
				s1.append(",");
			}
		}
		
		return filterMessage(s1.toString(), s2.toString());		
	}
	
	private static String filterMessage(String s1, String s2) {
		
		StringBuilder result = new StringBuilder();
		
		if((s1.length() > 0) && (s2.length() > 0)) {
			result.append(myMsgHello(s1, false));
			result.append(". AND Hello ");
			result.append(myMsgHello(s2, true));
			result.append(" !");
			
		}else if((s2.length() == 0)){
			result.append(myMsgHello(s1, false));
		}else {
			
			result.append(myMsgHello(s2, true));
			result.append(" !");
		}
		/**/
		return result.toString();
	}
	
	private static String myMsgHello(String s, boolean action) {
		StringBuilder result = new StringBuilder();
		String[] tab_noms = s.split(",");
		
		int nombreDenoms = 0;
		
		for(int k = 0 ; k < tab_noms.length ; k ++) {
			
			/*Condition permettant de savoir si on peut mettre and ou AND*/
			boolean confirmation = ((tab_noms.length >= 2)  && (k + 1) % tab_noms.length == 0 );
			
			if(!action) { 
				
				++nombreDenoms;
				
				if(confirmation) result.append(" and ");
				result.append(tab_noms[k].substring(0, 1).toUpperCase());
				result.append(tab_noms[k].substring(1));
				
			}else {
				
				++nombreDenoms;
				if(confirmation) result.append(" AND ");
				result.append(tab_noms[k]);
			}
			
			boolean condition =  (tab_noms.length > 2)  && ((k + 1) % (tab_noms.length) != 0) && ((nombreDenoms + 1) % tab_noms.length != 0);
			
			/*Si on a pluisieurs noms en miniscule*/
			if( !action  && condition) result.append(", ");
			/*Si on a pluisieurs noms en majusculse*/
			if( action  &&  condition) result.append(" ");
		}
		return result.toString();
	}
	
	private static String pretraitementMessage(String s) {
		
		StringBuilder msgClean = new StringBuilder();
		
		for(String e : s.split(" ")) {
			
			if(!e.equals(" ")) msgClean.append(e);
		}
		return msgClean.toString();
	}
		
}         