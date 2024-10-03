package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        int min = 1, max = 10;
        System.out.print("Veuillez entrer un nombre entre " + min + " et " + max + " : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        while (nb > max || nb < min) {
            System.out.print("Veuillez rentrer un nombre entre " + min + " et " + max + " SVP ! : ");
            nb = scanner.nextInt();
        }

    }
}
