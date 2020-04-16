package vezbeinternet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayofArrayList {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Koliko brojeva u prvu listu zelite da unesete: ");
        int brojac = sc.nextInt();
        List l1 = new ArrayList(brojac);
        for (int i = 0; i < brojac; i++) {

            System.out.println("Unesite rec u listu: ");
            String rec = sc1.nextLine();
            l1.add(rec);
        }
        System.out.println("Koliko brojeva u drugu listu zelite da unesete: ");
        int brojac1 = sc.nextInt();
        List l2 = new ArrayList(brojac1);
        for(int i = 0; i < brojac1; i++){
            System.out.println("Unesite rec u listu: ");
            String rec1 = sc.nextLine();
            l2.add(rec1);
            
        }
        List<String>[] arrayOfList = new List[2];
        arrayOfList[0] = l1;
        arrayOfList[1] = l2;
        
        
    }

}
