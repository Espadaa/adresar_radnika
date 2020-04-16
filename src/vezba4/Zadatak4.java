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
public class Zadatak4 {

    public static void ispisi() {

        Scanner sc = new Scanner(System.in);
        int godina;
        System.out.println("Unesite godinu: ");
        godina = sc.nextInt();
        if(godina %4 == 0){
            System.out.println("Godina je prestupna");
        }
        else{
            System.out.println("Godina nije prestupna");
        }
        
    }

}
