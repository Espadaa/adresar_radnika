package advancedvezbe;

import java.util.Scanner;

public class Niz {

    public static void prikazi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko zelite da unesete brojeva u niz: ");
        int suma = 0;
        int brojac = sc.nextInt();
        int[] niz = new int[brojac];
        for (int i = 0; i < brojac; i++) {
            System.out.println("Unesite "+(i+1)+ ". broj:");
            int broj = sc.nextInt();
            niz[i] = broj;
            suma = suma + niz[i];
        }
        for(int i = 0; i < brojac; i++){
            System.out.println(niz[i]);
        }
        System.out.println("Suma unetih brojeva u nizu je: " + suma);
        System.out.println("Cetvrti element niza je: "+niz[3]);
    }
}
