package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] arg){
        byte b = 127;
        short s = 5;
        int i = 1;
        long l = 2000000L;
        float f = 3.14f;
        double d = 6.14;
        char c = 'c';
        String randomString = "Voici le résultat d'un calcul : \n"+ i +" + "+ s +" = "+ (i+s);
        boolean bool = true;

        double[] chiffres = {b,s,i,l,f,d};
        for (double chiffre : chiffres) {
            System.out.print(chiffre + "\n");
        }
        System.out.println(randomString);



    }
}
