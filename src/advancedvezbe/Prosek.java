package advancedvezbe;

import java.util.Scanner;

public class Prosek {

    public static void prikazi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko brojeva zelite da unesete: ");
        int brojac = sc.nextInt();
        int broj;
        int suma = 0;
        for (int i = 0; i < brojac; i++) {
            System.out.println("Unesite " + (i + 1) + ". broj: ");
            broj = sc.nextInt();
            suma = suma + broj;
            
        }
        double prosek = suma / brojac;
        System.out.println("Prosecna vrednost unetih brojeva je: "+ prosek);
    }
}
