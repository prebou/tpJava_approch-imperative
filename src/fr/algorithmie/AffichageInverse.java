package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int longueurArray = array.length;

        // creation d'arrayCopy vide avec la même longueur que tableau array
        int[] arrayCopy = new int[longueurArray];

        //affichage l'ensemble des éléments du tableau
        System.out.println("Affichage l'ensemble des éléments du tableau :");
        for (int element : array){
            System.out.print(" | " + element);
        }

        //affichage l'ensemble des éléments du tableau dans l'ordre inverse
        System.out.println("\n\nAffichage l'ensemble des éléments du tableau dans l'ordre inverse : ");
        for (int i = longueurArray - 1 ; i >= 0 ; i--){
            System.out.print(" | " + array[i]);
        }

        //affichage d'arrayCopy avant le copie
        System.out.println("\n\narrayCopy avant la procedure de copie : ");
        for (int element : arrayCopy){
            System.out.print(" | " + element);
        }

        //copie de array vers arrayCopy
        for (int i = 0; i < longueurArray;i++){
            arrayCopy[i] = array[i];

        }

        //affichage d'arrayCopy apres le copie
        System.out.println("\n\narrayCopy après la procedure de copie : ");
        for (int element : arrayCopy){
            System.out.print(" | " + element);
        }
    }
}
