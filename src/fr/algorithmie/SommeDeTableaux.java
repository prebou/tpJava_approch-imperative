package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] liste = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4},
                liste2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        //longueur des deux tableaux
        int longueurListe1 = liste.length, longueurListe2 = liste2.length;

        if (longueurListe1 == longueurListe2) {
            System.out.println("Après vérification de la longueur des deux tableau : ");
            int[] arraySomme = new int[longueurListe1];
            for (int i = 0; i < longueurListe1; i++) {
                arraySomme[i] = liste[i] + liste2[i];
                System.out.print(" | " + arraySomme[i]);
            }
            System.out.println(" |");
        } else {
            System.out.println("longueur des deux tableaux ne sont pas identique ");
        }


    }
}
