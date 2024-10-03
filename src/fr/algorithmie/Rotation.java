package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] liste = {0, 1, 2, 3};

        int longueurListe = liste.length, a = longueurListe - 1;

        int[] rotation = new int[longueurListe];
        rotation[0] = liste[a]; //mettre dernier valeur de la tableau dans l'index 0

        for (int i = 1; i < longueurListe; i++) { //puis continuer la boucle de la position 1
            rotation[i] = liste[i - 1];
            //System.out.println(rotation[i]);
        }

        //affichage après rotation
        for (int r : rotation) {
            System.out.println(r);
        }
    }
}
