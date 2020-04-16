
package vezba7;

import java.util.Scanner;


public class Zadatak1 {

    public static void ispisi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1:");
        float godina1 = sc.nextFloat();
        System.out.println("2:");
        float godina2 = sc.nextFloat();
        System.out.println("3:");
        float godina3 = sc.nextFloat();
        System.out.println("4:");
        float godina4 = sc.nextFloat();
        
        
    
        System.out.println("Ukupan prosek: "+ ukupanProsek(godina1, godina2, godina3, godina4));
     
    }
    public static float ukupanProsek(float godina1, float godina2, float godina3, float godina4){
        float ukupanProsek = (godina1 + godina2 + godina3+ godina4) /4;
         
        return ukupanProsek;
    }
}
