package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] tabVilles = {"Paris", "Etretat", "Nanterre", "Aubervilliers", "Rueil-Malmaison"};

        int longueurTab = tabVilles.length;
        System.out.println("longeur du tableau est : "+ longueurTab);

        //boucle avec incrementation
        for (int i = 0; i < longueurTab; i++){

            if (i == 2){
                //modification de la valeur index 3
                tabVilles[i] = "Reims";
            }
            System.out.println((i+1) + ") ville : " +tabVilles[i]);
        }

        //boucle avec foreach
        for (String element : tabVilles){
            System.out.println(element);
        }

    }
}
