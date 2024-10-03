package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        //declaration de tableau
        int[] tabNb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //affichacge de premier élément du tableau
        System.out.println("Première element du tableaux est de " + tabNb[0]);

        //affichage de longueur du tableaux
        int longueurTab = tabNb.length;
        System.out.println("La longueur du tableaux est de " + longueurTab);

        //dernier element du tableau
        System.out.println("Le dernier element du tableau est le " + tabNb[longueurTab - 1]);

        //modification de l'élément d'index 4
        tabNb[3] = 8;


    }
}
