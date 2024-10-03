package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        int nb = 10;
        //affichage de tous les nombre de 1 à 10
        for (int i = 1; i <= nb; i++){
            System.out.println(i);
        }

        //affichage de nombres pairs et impairs entre 0 et 10
        System.out.println("\nAffichage de nombres pairs et impairs entre 0 et 10 :");
        for (int i = 0; i <= nb; i++){
            if (i % 2 == 0){
                System.out.println("ce chiffre est pair : " + i);
            }
            else {
                System.out.println("ce chiffre est impair : " + i);
            }
        }

        //utlisation de la boucle while
        int i = 0 , p = 0;
        while (i < nb){
            i++;
            System.out.print(" | " + i);
        }
        System.out.println(" |\nLes nombres pairs et impairs avec la boucle while");

        while (p <= nb){
            if (p % 2 == 0){ //verifier si i est pair
                System.out.println(p + " est le nombre pair");
            }
            else{ //sinon c'est du impair
                System.out.println(p + " est le nombre impair");
            }
            p++;
        }


    }
}
