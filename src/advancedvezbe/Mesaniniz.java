package advancedvezbe;

import java.util.Scanner;

public class Mesaniniz {
public static void prikazi(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite koliko brojeva zelite da unesete u niz: ");
    int brojac = sc.nextInt();
    double[] niz1 = new double[brojac];
    System.out.println("Unesite koliko reci zelite da unesete u niz: ");
    int reci = sc.nextInt();
    System.out.println("Unesite brojeve u prvi niz: ");
    String[] niz2 = new String[reci];
    for(int i = 0; i < brojac; i++){
        double broj = sc.nextDouble();
        niz1[i] = broj;
    }
    System.out.println("Unesite reci u drugi niz: ");
    for(int i = 0; i < reci; i++){
        String rec = sc.nextLine();
        niz2[i] = rec;
    }
    System.out.println("Niz sa unetim brojevima je: ");
    System.out.println("Niz sa unetim recima je: ");
}    
}
