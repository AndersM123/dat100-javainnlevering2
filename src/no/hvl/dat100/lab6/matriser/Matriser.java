package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String utskrift = "";
		String rekkeStreng="";
		
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				Integer.toString(tall);
				rekkeStreng += tall + " ";
			}
			utskrift += rekkeStreng + "\n";
			rekkeStreng="";
		
	}
		return utskrift;
		
	}

	// c)
	public static int[][] skaler(int multi, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		int i = 0;
		int j = 0;
		
		for (int[] rekke : matrise) {
			for (int tall : rekke) {			
				nyMatrise[i][j] = tall * multi;				
				j++;
			}
		i++;	
		j = 0;										
		}	
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int i = 0;
		int j = 0;
		
		for (int[] rekke : a) {
			for (int tall : rekke) {				
				if (tall != b[i][j]) {		
					return false;
				}
				j++;
			}
			j = 0;														
			i++;
		}
		return true;
		
	}
	
	
}
