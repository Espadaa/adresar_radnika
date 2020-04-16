package vezbeinternet;

import java.util.Scanner;

public class Zadatak2 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko brojeva zelite: ");
        int brojevi = sc.nextInt();
        int[] niz = new int[brojevi];
        for(int i = 0; i <brojevi; i++){
            int broj = sc.nextInt();
            niz[i] = broj;
        }
        
        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {

            if (niz[i] > max) {
                
                max = niz[i];
                
            } 

            

        }
        System.out.println("Najveci broj je: "+ max);
        }
        
        
    }

