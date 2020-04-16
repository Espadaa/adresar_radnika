package advancedvezbe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
public static void prikazi(){
    Scanner sc = new Scanner(System.in);
    
    List k = new ArrayList();
    k.add(100);
    k.add("Nikola");
    k.add(5.86);
    System.out.println("Array lista ima clanova: "+k.size());
    for(int i = 0; i< k.size();i++){
        System.out.println("array lista sadrzi: "+k.get(i));
    }
    List l = new ArrayList();
    System.out.println("Unesite koliko zelite elemenata da unesete: ");
    int broj = sc.nextInt();
    for(int i = 0; i < broj; i++){
        System.out.println("Unesite "+ (i+1)+ ". clan lise: ");
        l.add(sc.nextInt());
    }
    System.out.println("Elementi liste su:");
    for(int i = 0; i < l.size(); i++){
        System.out.print(l.get(i)+ " ");
    }
}    
}
