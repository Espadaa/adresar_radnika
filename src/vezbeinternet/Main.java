package vezbeinternet;

import advancedvezbe.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //UnosImena.ispisi();
       // JavaArrayofArrayList.ispisi();
        //Proba.ispisi();
       // Zadatak1.ispisi();
        // Zadatak2.ispisi();
        System.out.println("Koliko automobila zelite da unesete: ");
        int broj = sc.nextInt();
        String[] nizModel = new String[broj];
        int[] nizBrzina = new int[broj];
        String[] nizAuto = new String[broj];
        Automobil[] nizAutomobil = new Automobil[broj];
        for (int i = 0; i < broj; i++) {
            Automobil a = new Automobil();
            System.out.println("Unesite marku proizvodjaca: ");
            a.proizvodjac = sc1.nextLine();
            System.out.println("Unesite model auta:  ");
            a.model = sc2.nextLine();
            System.out.println("Unesite brzinu auta: ");
            a.brzina = sc.nextInt();
            nizBrzina[i] = a.brzina;
            nizAuto[i] = a.proizvodjac;
            nizModel[i] = a.model;
            
            nizAutomobil[i] = a; 
            
        }
        for(int i = 0; i <nizAutomobil.length; i++){
            System.out.println("Proizvodjac " + (i+1)+ ". je: "+nizAutomobil[i].proizvodjac + " Marka je: "+nizAutomobil[i].model + " Brzina je: "+nizAutomobil[i].brzina);
        }
        
        
        
        int max = nizBrzina[0];
        String auto = nizAuto[0];
        for(int i = 0; i < nizAutomobil.length; i++){
            if(nizBrzina[i] > max ) {
                max = nizBrzina[i];
                auto = nizAuto[i];
            }
        }
        
        System.out.println("Auto koji ima najvecu brzinu je: "+auto);

    }
}
