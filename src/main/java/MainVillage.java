public class MainVillage {

	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
				"Grand Schtroumpf",
				"Schtroumpf courant (et pas ordinaire)",
				"Schtroumpf ordinaire (et pas courant)",
				"Schtroumpf moralisateur � lunettes",
				"Schtroumpf boudeur",
				"Schtroumpf volant",
				"Schtroumpf �tonn�",
				"Schtroumpf acrobate",
				"Schtroumpf paresseux"
		};

		// 4.3.1
		Village village = new Village("Konoha", 0, nomsSchtroumpfs);
		System.out.println("Le village : " + village.getNom() + "\n    - contient : " + village.getNbSchtroumpf() + " Schtroumpf" + "\n    - et " + village.getStockSalsepareille() + " feuilles de salsepareille.");
		village.solstice_d_ete();

		System.out.println("\n\n\n\n\n");
		// 4.3.2.4
		// Chef du village
		Schtroumpf chef = village.chefDuVillage();
		System.out.println("Chef du village : " + chef.toString());
		// Go au charbon
		village.envoyerAuTravail();
		// Schtroumpf heureux
		village.schtroumpsfHeureux();

		System.out.println("\n\n\n\n\n");
		// 5.2.4
		village.envoyerCueillirSalsepareille();
		village.solstice_d_ete();
		village.dinerTousEnsemble();
		village.solstice_d_ete();

	}



}
