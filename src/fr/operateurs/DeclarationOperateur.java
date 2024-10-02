package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        //déclaration des variables
        int a = 10;
        int b = 20;

        // test Et
        boolean testEt = a > 0 && b < 10;

        // test Ou
        boolean testOu = a > 0 || b < 10;

        //Les operateurs combines
        int i = 1; // 1
        i = i + 1; // +1
        i++; // +1
        i += 1; // +1

        // L'operateur ternaire
        String c = a > 0 ? "a est plus grand que 0 " : "a est inferieur à 0";

        //affiche de resultat
        System.out.println("resultat de Et : " + testEt + "\nresultat de Ou : " +
                testOu + "\nvaleur d'i : "+ i + "\nLa valeur de c = "+ c);

    }
}
