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
public class Zadatak2 {
    public static void ispisi(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Unesite broj koji zelite da stepenujete: ");
        int broj = sc.nextInt();
        System.out.println("Unesite broj kojim cete da stepenujete: ");
        int stepen = sc.nextInt();
        
        stepen(broj, stepen);
        
        System.out.println("Stepenovani broj je: "+ stepen(broj, stepen));
    }
    public static int stepen(int broj, int stepen ){
        int rezultat = 1;
        for(int i = 1; i <= stepen ; i++){
            rezultat = rezultat * broj;
        }
        return rezultat;
    }
}
