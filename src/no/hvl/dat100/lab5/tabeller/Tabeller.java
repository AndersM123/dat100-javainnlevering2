package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
			for (int b : tabell) {
				System.out.print(b + " ");
			}
			
		}

	

	// b)
	public static String tilStreng(int[] tabell) {

	String streng = "[";
		
		for (int i=0; i<=tabell.length - 1; i++) {
			
		String p = String.valueOf(tabell[i]);
		
			streng = streng + p + ", ";
			
			
			
		}
		streng+="]";
		
		return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {

int sum=0;
		
		for (int i=0; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}
		return sum;
	
	}
	/*
	private static int summer (int[] tabell) {
		int sum=0;
		
		for (int i:tabell) {
			sum+=i;
		}
		return sum;
	}
	
	private static int summer (int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum+=tabell[i];
			i++;
		}
		return sum;
		
	}
	*/
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		
		while (i < tabell.length && (!funnet)) {
			if (tabell[i] > tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i=0; i<tabell.length-1; i++) {
			if(tabell[i] == tall)
				return i;
		}
			return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] nyTab = new int [tabell.length];
		for (int i=0; i<nyTab.length; i++) {
			
			nyTab[i] = tabell[tabell.length-(i+1)];
		}
		return nyTab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i]> tabell[i+1]) {
				return false;
			}
			
		}
		return true;	
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = (tabell1.length + tabell2.length);
		int [] nyTab = new int [nyLengde];
		
		int i = 0;
		for (i=0; i<tabell1.length; i++) {
			
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j<tabell2.length; j++) {
			nyTab[i] = tabell2[j];
			i++;
		}
		
		return nyTab;
	}
}
