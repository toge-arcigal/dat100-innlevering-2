package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int t : tabell){
			System.out.println(t + "");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String[] tab = {"42", "67", "89"};
		String resultat = "[";

		for (int i = 0; i < tab.length; i++) {
			resultat = resultat + tab[i];

			if (i < tab.length - 1) {
				resultat = resultat + ",";
			}
		}
		resultat = resultat + "]";
		System.out.println(resultat);
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		int[] tall = {4, 6, 11};
		int sum = 0;

		for (int i : tall){
			sum = sum + i;
		}
		System.out.println("sum = " + sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		//SKAL JEG LAGE EN TABELL FØRST MED EGNE TALL??
		boolean funnet = false;
		int i = 0;

		while (i < tabell.length && !funnet){
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
		System.out.println("motsatt rekkefølge: " + funnet);
		return funnet;
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
