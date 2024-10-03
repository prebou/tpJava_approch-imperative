package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        //déclaration du tableaux
        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};

        int index = 0;
        //longueur du tableaux
        int longueur = tab.length;
        //dernier index du tableau
        int dernierIndex = longueur - 1;

        System.out.println("valeur de l'index " + index +" : "+ tab[index] +
                "\nlongueur du tableau est de "+ longueur +
                "\nL'entier  positionné au dernier index est de " + tab[dernierIndex]);
        /* on ne peux pas afficher l'entier d'index 10 car la longueur du tableau est de 8.
        pour afficher l'index 10 il faut ajouter encore trois valeur en plus dans le tableau*/



    }
}
