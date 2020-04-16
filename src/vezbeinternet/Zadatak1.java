package vezbeinternet;

import java.util.Scanner;

public class Zadatak1 {

    public static void ispisi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko brojeva zelite: ");
        float brojevi = sc.nextInt();
        float sredina = 0;
        for (int i = 0; i < brojevi; i++){
            float brojArit = sc.nextInt();
            sredina = sredina + brojArit;
        }
        float ostatak = (float) sredina%brojevi;
        System.out.println("Aritmeticka sredina unetih brojeva je: "+ sredina/brojevi);
        System.out.println("Ostatak pri deljenju ako postoji je: "+ ostatak);
        
        
    }
}
