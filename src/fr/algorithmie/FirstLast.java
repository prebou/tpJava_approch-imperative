package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] liste = {1, 5, 1};

        int longueurListe = liste.length, first = liste[0], last = liste[longueurListe - 1];

        //true si longueur de la liste est supérieure ou egal à 1 et 1er valeur est egal à dernier valeur, sinon false
        boolean resultat = (longueurListe >= 1 && first == last) ? true : false;

        System.out.println("Resultat est : " + resultat);
    }
}
