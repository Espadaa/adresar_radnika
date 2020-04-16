package advancedvezbe;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kurs k1 = new Kurs("Kurs", 12, 666, 75);
        Java j1 = new Java("Kurs 1", 6, 120000, 30, "Objektno programiranje");
        MySQL my1 = new MySQL("Kurs 2", 12, 100000, 25, "Mysql Workbench");
        Photoshop p1 = new Photoshop("Kurs 3", 12, 200000, 20, "Photoshop CS5");

        System.out.println("Koji kurs zelite da ispise: ");
        int broj = sc.nextInt();

        if (broj == 1) {
            k1.prikazi();
        } else if (broj == 2) {
            j1.prikazi();
        } else if (broj == 3) {
            my1.prikazi();
        } else if (broj == 4) {
            p1.prikazi();
        } else {
            System.out.println("Nema unetog kursa pod tim brojem!");
        }
        JedanDvesta.prikazi();
       //ParniNeparni.prikazi();
        
        Faktorijal.ispisi();
        //Array.prikazi();
       //Mesaniniz.prikazi();
        //Niz.prikazi();
        //   Prosek.prikazi();
    }
}
