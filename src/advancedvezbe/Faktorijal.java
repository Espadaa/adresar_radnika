package advancedvezbe;

import java.util.Scanner;

public class Faktorijal {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesitek koliko brojeva zelite da unesete: ");
        int brojac = sc.nextInt();
        int faktorijal = 1;
        for (int i = 1; i <= brojac; i++) {
            System.out.print("Unesite " + i + ". broj: ");
            int broj = sc.nextInt();
            System.out.println("Racunanje faktorijala...");
            faktorijal = faktorijal * i;

        }
        System.out.println("Faktorijal unetog broja je: " + faktorijal);
    }
}
