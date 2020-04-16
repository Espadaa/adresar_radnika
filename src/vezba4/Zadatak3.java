/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba4;

import java.util.Scanner;

public class Zadatak3 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        int broj;
        int brojac = 0;
        int parni = 0;
        int neparni = 0;
        System.out.println("Koliko brojeva zelite: ");
        brojac = sc.nextInt();
        for (int i = 0; i < brojac; i++) {
            System.out.println("Unesite " + (i + 1) + ". broj: ");
            broj = sc.nextInt();
            if (broj % 2 == 0) {
                parni++;

            } else if (broj % 2 != 0) {
                neparni++;

            }

        }
        System.out.println("Uneto je " + parni + " brojeva i " + neparni + " neparnih brojeva");
    }

}
