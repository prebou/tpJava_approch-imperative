package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int longueurArray = array.length;
        //affichage l'ensemble des éléments du tableau
        for (int element : array) {
            System.out.print(" | " + element);
        }

        System.out.println(" |\n");

        //affichage l'ensemble des éléments du tableau dans l'ordre inverse
        System.out.println("tableau dans l'ordre l'inverse : ");
        for (int i = longueurArray - 1; i >= 0; i--) {
            System.out.print(" | " + array[i]);
        }
        System.out.println(" |\n");

        //afficher que les entiers supérieurs à 3
        int superieur = 3;
        System.out.println("Les entiers supérieurs à " + superieur + " sont : ");
        for (int element : array) {
            //superieur à variable superieur
            if (element > superieur) {
                System.out.print(" | " + element);
            }
        }
        System.out.println(" |\nLes entiers pairs : ");

        for (int i = 0; i < longueurArray; i++) {
            //entiers pairs
            if (array[i] % 2 == 0) {
                System.out.println("index : " + (i + 1) + " valeur : " + array[i]);
            }
        }

        System.out.println("\nles entiers impairs");
        for (int i = 0; i < longueurArray; i++) {
            //entiers impairs
            if (array[i] % 2 != 0) {
                System.out.println("index : " + (i + 1) + " valeur : " + array[i]);
            }
        }

    }
}
