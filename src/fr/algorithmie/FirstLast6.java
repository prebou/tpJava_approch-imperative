package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] liste = {6, 5, 0};
        int longueurListe = liste.length, lastElement = longueurListe - 1;

        //true si longueurListe est superieur à 0 et premiere élément ou dernier element vaut 6, sinon false
        boolean resultat = ((longueurListe > 0) && ((liste[0] == 6) || (liste[lastElement] == 6))) ? true : false;
        System.out.println("resultat est : " + resultat);
    }
}
