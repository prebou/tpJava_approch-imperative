package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int longueurArray = array.length; //mettre longueur du tableaux dans la variable longueurArray
        int[] arrayCopy = new int[longueurArray]; //creation de tableau même longueur que tableau array

        //affichage de tableau array
        System.out.println("Tableau array :");
        for (int e : array){
            System.out.print(" | " + e);
        }

        //copie de tous les éléments du tableau array dans le arrayCopy dans l'ordre inverse
        System.out.println("\n\nTableau arrayCopy dans l'ordre inverse :");
        int a = 0;
        for (int i = longueurArray - 1; i >= 0; i--){
            arrayCopy[a] = array[i];
            System.out.print(" | " + arrayCopy[a]);
            a++;
        }

    }
}
