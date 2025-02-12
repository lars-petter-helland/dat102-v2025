package dat102.f05.stabel.lenketstabel;


import dat102.f05.stabel.lenketstabel.LenketStabel;


public class ParentesSjekker {
	
	public static boolean sjekkParanteser(String s) {
		LenketStabel<Character> stack = new LenketStabel<>();
		
		for(char c : s.toCharArray()) {
			if(startParentes(c)) {
				stack.push(c);
			} else if(sluttParentes(c)) {
				if(stack.isEmpty()) {
					return false;
				}
				char topp=stack.pop();
				if(!erParentesPar(topp,c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}
	
	
    // Hjelpemetoder for å sjekke om et tegn er en start- eller sluttparentes:
    
    // Returnerer true hvis c er en startparentes ({, [, ()
    private static boolean startParentes(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    // Returnerer true hvis c er en sluttparentes (}, ], ))
    private static boolean sluttParentes(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    // Returnerer true hvis start og slutt danner et gyldig par
    private static boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')') ||
               (start == '[' && slutt == ']') ||
               (start == '{' && slutt == '}');
 
}
}
