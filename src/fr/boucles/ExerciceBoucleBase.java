package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        //affichage de nombre de 1 à 10
        int nombrMax = 10;
        for (int i = 1; i <= nombrMax; i++){
            System.out.println(i);
        }

        byte nb = 20;
        byte i = 1;
        String nomPrenom = "Suresh Parameswaran";
        //affichage de nom et prenom nb fois
        while (i <= nb){
            System.out.println(i + ") " + nomPrenom);
            i++;
        }

        //affichage des éléments pairs et impaire
        System.out.println("Affichage des elements pairs et impairs");
        for (int p = 1; p <= 100; p++){
            if (p % 2 == 0){
                System.out.println(p + " est pair ");
            }
            else {
                System.out.println(p + " est impair");
            }
        }

    }
}
