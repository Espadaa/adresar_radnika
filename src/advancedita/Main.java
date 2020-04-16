package advancedita;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter f = new FileWriter("lekovi.txt");
        Scanner sc = new Scanner(System.in);
        Lek l1 = new Lek("Ospamox", "Leci sidu", 150, "DR Aleksa Ristic");
        Lek l2 = new Lek("Amoksicilin", "Leci koronu", 1000000, "DR Aleksa Ristic");
        sirup s1 = new sirup("Sirup S1", "Leci kasalj", 1000, "Dr Jelena Kostic", "gust brt");
        sirup s2 = new sirup("Sirup S2", "Leci kasalj i koronu", 1001000, "Dr Jelena Kostic", "gust brt");
        tablete t1 = new tablete("Kokain", "Sve leci", 12000, "Dr Djordje Stamenkovic", 1000);
        tablete t2 = new tablete("Ekstaza", "Sve leci i bude ti lepo", 12001, "Dr Djordje Stamenkovic", 1000);
        pomagala p1 = new pomagala("Papir", "U to motas", 145, "Dr Trafika", "To ti je ono providno");
        pomagala p2 = new pomagala("Duvan", "To stavljas u papir", 145, "Dr Trafika", "Unistava pluca");
        l1.naziv = "Brufen";
        l1.dejstvo = "Umanjuje bolove";
        l1.cena = 300;
        l1.recept = "Dr Boban";
        Date d = new Date();
        System.out.println("Sta zelite da uradi: (1. upis, 2.ispis)");
        int operacija = sc.nextInt();
        if (operacija == 1) {
            System.out.println("Sta zelite da upisete: 1.lek, 2.sirup, 3.tablete, 4.pomagala");
            int operBroj = sc.nextInt();
            if (operBroj == 1) {
                f.write("Podaci o  leku su: " + l1.naziv + " " + l1.dejstvo + " " + l1.cena + " " + l1.recept);
                f.write("\nVreme upisa u fajl je: " + d.toString());
                f.close();
                System.out.println("Podaci o leku su uneti u fajl!");

            } else if (operBroj == 2) {
                f.write("Podaci o sirupu su:" + s1.naziv + " " + s1.dejstvo + " " + s1.cena + " " + s1.recept + " " + s1.gustina);
                f.write("\nVreme upisa u fajl je: " + d.toString());
                f.close();
                System.out.println("Podaci o sirupu su uneti!");
            } else if (operBroj == 3) {
                f.write("Podaci o tableti su:" + t1.naziv + " " + t1.dejstvo + " " + t1.cena + " " + t1.recept + " " + t1.miligrami);
                f.write("\nVreme upisa u fajl je: " + d.toString());
                f.close();
                System.out.println("Podaci o tableti su uneti!");

            } else if (operBroj == 4) {
                f.write("Podaci o pomagalu su:" + p1.naziv + " " + p1.dejstvo + " " + p1.cena + " " + p1.recept + " " + p1.opis);
                f.write("\nVreme upisa u fajl je: " + d.toString());
                f.close();
                System.out.println("Podaci o pomagalu su uneti!");
            }

        } else if (operacija == 2) {
            System.out.println("Sta zelite da ispise: ");
            int ispis = sc.nextInt();
            if (ispis == 11) {
                l1.ispis();
            } else if (ispis == 12) {
                l2.ispis();
            } else if (ispis == 21) {
                s1.ispis();
            } else if (ispis == 22) {
                s2.ispis();
            } else if (ispis == 31) {
                t1.ispis();
            } else if (ispis == 32) {
                t2.ispis();
            } else if (ispis == 41) {
                p1.ispis();
            } else if (ispis == 42) {
                p2.ispis();
            } else {
                System.out.println("Unete pogresne vrednosti!");
            }
        }
    }

    /*vozila v1 = new vozila("Reno", 1001, "Crvena", "Sport");
     vozila v2 = new vozila("Reno", 1002, "Crvena", "Sport");
     vozila v3 = new vozila("Reno", 1003, "Crvena", "Sport");
     System.out.println("Koje vozilo zelite da ispisete: ");
     int vozilo = sc.nextInt();
     if(vozilo == 1){
     v1.podaci();
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
     Date date = new Date(System.currentTimeMillis());
     System.out.println(formatter.format(date));
     }
     else if(vozilo == 2){
     v2.podaci();
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
     Date date = new Date(System.currentTimeMillis());
     System.out.println(formatter.format(date));
     }
     else if(vozilo == 3){
     v3.podaci();
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
     Date date = new Date(System.currentTimeMillis());
     System.out.println(formatter.format(date));
     }
     else{
     System.out.println("Uneli ste pogresne vrednosti!");
     }
     */
}
