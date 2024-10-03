package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4},
                array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int longueurArray1 = array1.length, longueurArray2 = array2.length, grand = 0, petit = 0;

        //prendre la longueur du table plus grand

        for (int i = 0; i < 2; i++) {
            if (longueurArray2 > grand) {
                grand = longueurArray2;
                petit = longueurArray1;
            } else {
                grand = longueurArray1;
                petit = longueurArray2;
            }
        }

        //trier deux tableaus par taille
        int[] grandArray = new int[grand];
        int[] petitArray = new int[petit];

        //affecter les tableaux par rapport à la taille,
        //pour ne pas avoir d'erreur même si on change de l'ordre du tableau
        if (grand == longueurArray1){
            grandArray = array1;
            petitArray = array2;
        }else {
            grandArray = array2;
            petitArray = array1;
        }


        //compter les éléments en commun dans ces 2 tableaux et l'afficher
        System.out.println("Les éléments en commun sont : ");
        int count = 0;
        for (int e : grandArray){
            int valeurArray1 = e;

            for (int value : petitArray){
                if (valeurArray1 == value){
                    count++;
                    System.out.print(" | " + value);
                }
            }
        }
        System.out.println(" |\nIl y a " + count + " éléments en commun dans ces 2 tableaux.");


    }
}
