package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        int min = 1, max = 10;
        System.out.println("Veuillez saisir entre 1 et 10 pour afficher table de multiplication : ");
        Scanner scanner = new Scanner(System.in);
        int nbM = scanner.nextInt();
        while (nbM < min || nbM > max) {
            System.out.println("Veuillez resaisir entre 1 et 10 pour afficher table de multiplication SVP ! : ");
            nbM = scanner.nextInt();
        }
        for (int i = 1; i <= max; i++) {
            System.out.println(i + " x " + nbM + " = " + (nbM * i));
        }
    }
}
