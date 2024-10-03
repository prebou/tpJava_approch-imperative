package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int lengthArray = array.length;
        int nbMax = 0;
        for (int i = 0; i < lengthArray; i++) {
            int valeur = array[i];
            if (valeur > nbMax) { //si valeur est superieur à nbMax alors nbMax sera ecraser par la variable valeur
                nbMax = valeur;
            }
        }
        System.out.println("Le plus grand nombre est le : " + nbMax);
    }
}
