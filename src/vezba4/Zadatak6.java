/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba4;

import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class Zadatak6 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        
        
        int w;
        int h;
        System.out.println("Unesite sirinu: ");
        w = sc.nextInt();
        System.out.println("Unesite visinu: ");
        h = sc.nextInt();

        for (int i = 0; i < h; i++) {

            for (int a = 0; a < w; a++) {
                if ((i == 0) || (i == (h - 1)) || (a == 0) || (a == (w - 1))) {
                    System.out.print("#");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println("");
        }

    }
}
