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
public class Zadatak5 {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        int dan; 
        dan = sc.nextInt();
        if (dan %7 == 1){
            System.out.println("Ovo je subota");
        }
        else if(dan %7 == 2){
            System.out.println("Ovo je nedelja");
        }
    }
}
