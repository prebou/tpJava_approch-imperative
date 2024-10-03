package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {

        int nb = 10, anneNe = 1999, age = 2024 - anneNe;
        String nom = "Suresh", prenom = "Parameswaran";

        for (int i = 1; i <= nb; i++) {
            System.out.println(i + ") je m'appelle " + nom + " " + prenom + ", j'ai " + age + " ans.");
        }
    }
}
