package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] liste1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4},
                liste2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int longueurListe1 = liste1.length, longueurListe2 = liste2.length,
                sommeListe = longueurListe1 + longueurListe2;

        int[] arraySomme = new int[sommeListe];

        //ajout de tableau 1 et 2  dans le tableau arraySomme
        System.arraycopy(liste1, 0, arraySomme,0,longueurListe1);
        System.arraycopy(liste2, 0, arraySomme, longueurListe1, longueurListe2);

        System.out.println("Après avoir fusionner les deux tableaux :");
        for (int element : arraySomme){
            System.out.print(" | " + element);
        }
        System.out.println(" |");
    }
}
