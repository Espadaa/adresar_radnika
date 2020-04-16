/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba4;

import java.util.Scanner;

public class Zadatak2 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);

        int broj;
        System.out.println("Unesite broj: ");
        broj = sc.nextInt();
        if (broj > 0 && broj <= 10000) {
            System.out.println("Broj je manji ili jedan od 10000");
        } else if (broj > 10000 && broj <= 20000) {
            System.out.println("Broj je izmedju 10000 i 20000");
        } else if (broj > 20000 && broj <= 30000) {
            System.out.println("BRoj je izmedju 20000 i 30000");
        } else {
            System.out.println("Uneli ste premali ili preveliki broj");
        }
    }
}
