package vezba6;

import java.util.Scanner;

public class Zadatak1 {

    public static void ispisi() {
        Scanner sc = new Scanner (System.in);
        Osoba o1 = new Osoba("Aleksa", "Ristic", 30, 170, 165);
        o1.godine = 20;
        o1.tezina = 170;
        o1.ime = "Aleksa";
        o1.prezime = "Ristic";
        o1.visina = 165;
        
        Osoba o2 = new Osoba();
        o2.godine = sc.nextInt();
        o2.tezina = sc.nextInt();
        o2.ime = sc.nextLine();
        o2.prezime = sc.nextLine();
        o2.visina = sc.nextInt();
        
        o2.prikazi();
        

        Student s1 = new Student(128, "Filip", "Krstic", 22, 98, 185);
        s1.brIndeksa = 130;
        int idealnaTezina = o1.idealnaTezina();
     //o1.prikazi();
        //s1.prikazi();
        if (o1.tezina > idealnaTezina) {
            System.out.println("MAST");
        } else if (o1.tezina == idealnaTezina) {
            System.out.println("Dobar si");
        } else {
            System.out.println("KOST");
        }
    }
}
