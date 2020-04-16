package advancedvezbe;

import java.util.Scanner;

public class ParniNeparni {
public static void prikazi(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite koliko brojeva zelite da napravite: ");
    int brojac = sc.nextInt();
    int suma1 = 1000;
    int suma2 = 1000;
    for(int i = 0; i < brojac; i++){
        System.out.println("Unesite "+(i+1)+ ". broj: ");
        int broj = sc.nextInt();
        if(broj%2 == 0){
            suma1 = suma1 + broj;
        }
        else {
            suma2 = suma2 - broj;
        }
    }
    System.out.println("Suma parnih brojeva je: "+suma1);
    System.out.println("Suma/Razlika neparnih brojeva je: "+suma2);
}    
}
