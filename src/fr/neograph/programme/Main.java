package fr.neograph.programme;

public class Main {

	public static void main(String[] args) {
		boolean isOnline = false;
		byte nombre1 = 127;
		short nombre2 = 999;
		int nombre3 = 99999;
		long nombre4 = 9999999;
		float nombre5 = 1.5f;
		double nombre6 = 1.5;
		String chaine = "Hey 50";
		int test = 5;
		char chaineUnicode = 'A';
		
		System.out.println(isOnline);
		System.out.println(nombre1 + " " + nombre2);
		System.out.println(nombre3 + " " + nombre4);
		System.out.println(nombre5 + nombre6); // addition
		System.out.println(chaine);
		System.out.println(test);
		System.out.println(chaineUnicode);
		
		
		// boucles
		if(isOnline) {
			System.out.println("Online");
		}else {
			System.out.println("Offline");
		}
		
		// tableaux
		String pseudo = "Neograph";
		String[] pseudos = new String[]{"Neograph", "Iznobad"}; //new String optionnel
		System.out.println(pseudos[1]);
	}
	
}
