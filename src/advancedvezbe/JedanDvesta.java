package advancedvezbe;

public class JedanDvesta {
public static void prikazi(){
    System.out.println("Ispis brojeva: ");
    for(int i = 1; i <= 200; i++){
        System.out.print(i+ "\t ");
        if(i % 20 == 0){
            System.out.println(" ");
        }
    }
}    
}
