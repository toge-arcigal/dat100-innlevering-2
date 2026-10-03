package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++){
			System.out.println(tabell[i] + "");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat = "[";

		for (int i = 0; i < tabell.length; i++){
			resultat = resultat + tabell[i];
			if (i < tabell.length - 1){
				resultat = resultat + ",";
			}
		}
		resultat = resultat + "]";
		System.out.println(resultat);
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		int[] tall = tabell;
		int sum = 0;

		for (int i : tall){
			sum = sum + i;
		}
		System.out.println("sum = " + sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int [] tab = tabell;

		for (int i = 0; i < tab.length; i++){
			if (tab[i] == tall) {
				return true;
			}
		}m
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
