package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int lengthArray = array.length, nbMin = array[0];

        for (int i = 0; i < lengthArray; i++) {
            int valeur = array[i];
            if (valeur < nbMin) { //si valeur est inferieur à nbMin alors nbMin sera ecraser par la variable valeur
                nbMin = valeur;
            }
        }
        System.out.println("Le plus petit nombre est le : " + nbMin);
    }
}
