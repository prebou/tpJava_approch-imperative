package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int lengthArray = array.length;
        int nbMax = 3;

        //afficher que les entiers superieur à nbMax
        System.out.println("Les éléments superieur à " + nbMax + " :");
        for (int element : array) {
            if (element > nbMax) {
                System.out.print(" | " + element);
            }
        }
        System.out.println(" |");

        //afficher les entier pairs avec ses index
        System.out.println("\n\nLes entiers pairs");
        for (int i = 0; i < lengthArray; i++) {
            int valeur = array[i];
            if (valeur % 2 == 0) {
                System.out.println(valeur + " est pair, se trouve à l'index " + (i + 1));
            }
        }

        //afficher les entier impairs avec ses index
        System.out.println("\n\nLes entiers impairs");
        for (int i = 0; i < lengthArray; i++) {
            int valeur = array[i];
            if (valeur % 2 != 0) {
                System.out.println(valeur + " est impair, se trouve à l'index " + (i + 1));
            }
        }
    }
}
