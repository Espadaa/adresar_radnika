/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba9;

/**
 *
 * @author Filip
 */
public class Zadatak2 {
    public static void ispisi(){
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {a[0]+ b[0], a[1]+ b[1], a[2]+b[2]};
        for(int i = 0; i <c.length; i++){
            System.out.println(c[i]);
        }
    }
    
}
