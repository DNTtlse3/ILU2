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
		
		String[] data  = lesNoms.split(",");
		
		int nbOccurencePrenom;
		
		for(String prenom : data) {
			
			nbOccurencePrenom = occurenceName(data, prenom);
			
			String e = prenom+" (x"+nbOccurencePrenom+")";
			
			if(prenom.equals(prenom.toUpperCase())) {
				
				if(nbOccurencePrenom > 1) {
					
					if(!appartient(e, s2.toString())) s2.append(e);
					
				}else {s2.append(prenom);}
				
				s2.append(",");
				
			}else {
				
				if(nbOccurencePrenom > 1) {
					
					if(!appartient(e, s1.toString())) s1.append(e);
					
				}else {s1.append(prenom);}
				
				s1.append(",");
			}
		}
		
		return filterMessage(s1.toString(), s2.toString());		
	}
	
	/*
	 * false pour traiter les noms en minuscule
	 * true pour traiter les noms en majuscule
	 * */
	
	private static String filterMessage(String sOne, String sTwo) {
		
		/**/
		String s1 = filtrageCorrectifs(sOne);
		
		String s2 = filtrageCorrectifs(sTwo);
		
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
	
	/*Le paramètre action permet de distingeur une chaîne de caractères(chaine qui contient une ou pluisieurs noms)  
	 * qui est en majuscule ou miniscule. Si true la chaîne est en majuscule. Sinon minuscule.
	 * 
	 *
	 * */
	private static String myMsgHello(String s, boolean action) {
		
		StringBuilder result = new StringBuilder();
		
		String[] tab_noms = s.split(",");
		
		int nombreDenoms = 0;
		
		for(int k = 0 ; k < tab_noms.length ; k ++) {
			
			/*Condition permettant de savoir si on peut mettre and ou AND si le nombre de noms >= 2*/
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
			
			/*Cette propriéte permet d'éviter d'avoir une virgule devant un and ou espace devant un AND
			 * Par exemple si on a bod,amy, on veut Hello, bob and amy mais pas Hello, bob, and amy*/
			boolean condition =  (tab_noms.length > 2)  && ((k + 1) % (tab_noms.length) != 0) && ((nombreDenoms + 1) % tab_noms.length != 0);
			
			/*Si on a pluisieurs noms en miniscule*/
			if( !action  && condition) result.append(", ");
			
			/*Si on a pluisieurs noms en majusculse*/
			if( action  &&  condition) result.append(" ");
		}
		
		return result.toString();
	}
	
	/*Cette fonction permet d'enlever les espaces unitiles*/
	private static String pretraitementMessage(String s) {
		
		StringBuilder msgClean = new StringBuilder();
		
		for(String e : s.split(" ")) {
			
			if(!e.equals("")) msgClean.append(e);
		}
		return msgClean.toString();
	}
	
	/**/
	private static int occurenceName(String[] names, String noms) {
		int nbOccurences = 0;
		for(String e : names) {
			if(e.equals(noms)) ++nbOccurences;
		}
		return nbOccurences;
	}
	
	/**/
	private static boolean appartient(String s, String data) {
		for(String e : data.split(",")) {
			if(e.equals(s)) return true;
		}
		return false;
	}
	
	/**/
	private static String filtrageCorrectifs(String s) {
		StringBuilder rendu = new StringBuilder();
		for(String e : s.split(",")) {
			if(!e.equals("")) 
				rendu.append(e+",");
		}
		return rendu.toString();
	}
	
}     

