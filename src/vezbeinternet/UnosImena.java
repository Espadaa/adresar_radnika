package vezbeinternet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnosImena {

    public static void ispisi() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        List l1 = new ArrayList();
        for (int i = 0; i <= l1.size(); i++) {
            
         if(l1.contains("EXITE")){
             break;
         }
          
         else{
             System.out.println("Unesite rec: ");
             
             l1.add(sc1.nextLine().toUpperCase());
             
        }
        
    }
        for(int i = 0; i < l1.size(); i++){
           
            System.out.println(l1.get(i)+ " ");
        }
    }
}
