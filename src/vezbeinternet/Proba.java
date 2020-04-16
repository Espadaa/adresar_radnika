package vezbeinternet;

import java.util.Scanner;

public class Proba {

    public static void ispisi() {
// Unosim n broj koji je i vrsta i kolona, zbir parnih, proizvod pozitivnih, broj 0 iznad glavne dijagonale, broj neparnih elemenata ispod glavne dijagonale, najveci element na glavnoj i najmanji na sporednoj dijagonali

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko kolona i redova zelite: ");
        int n = sc.nextInt();
        int niz[][] = new int[n][n];
        int suma = 0;
        int razlika = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Unesite broj: ");
                niz[i][j] = sc.nextInt();
                if(i == 0 || j == n){
                    suma = suma + niz[i][j];
                }
               
               if(i == 0 && j <= n) {
                    razlika = razlika - niz[i][j];
                }
                 
            }

        }
        
        System.out.println("Zbir parnih brojeva je: "+suma);
        System.out.println("Razlika neparnih brojeva je: "+razlika);
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i][0] + " ");
            for(int j = 1; j < niz[i].length; j++){
                System.out.print(niz[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
