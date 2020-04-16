/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba8;

import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class Zadatak1 {

    public static void  ispisi() {
        Scanner sc = new Scanner(System.in);
        int broj = sc.nextInt();

        faktorijal(broj);
        System.out.println("Broj je: "+faktorijal(broj));

    }

    public static int faktorijal(int broj) {
        int rezultat = 1;
        for (int i = 1; i <= broj; i++) {
            rezultat = i * rezultat ;
        }
        return rezultat;
        
    }
}
