package oppgaveUke6;

public class oppgave2{
	
	public static void main(String[]args) {
	System.out.println(sum(100));
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+sum(n-1);
	
		
	}
	
}