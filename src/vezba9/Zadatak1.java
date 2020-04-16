/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba9;

import java.util.Scanner;

/**
 *
 * @author Filip
 */
public class Zadatak1 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        int brojacParnih = 0;
        int sumaParnih = 0;
        while (true) {
            int broj = sc.nextInt();
            if (broj % 2 != 0) {
                break;
            } else {
                brojacParnih++;
                sumaParnih = sumaParnih + broj;
            }

        }

        System.out.println("Broj parnih: " + brojacParnih + "Suma parnih brojeva: " + sumaParnih);
    }

}
