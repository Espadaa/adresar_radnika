package adresevol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class korisnici {

    String korIme;
    String password;
    String ime;
    String prezime;
    String id;

    public korisnici(String ime, String prezime, String id, String korIme, String password) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.korIme = korIme;
        this.password = password;
    }

    public korisnici() {
    }

    public static void novKorisnik() throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        List nova = new ArrayList();
        List stara = new ArrayList();
        try {

            File myObj = new File("korisnici.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Elementi ove liste su: ");
                stara.add(data);
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        korisnici nK = new korisnici();
        System.out.println("Unesite zeljeno korisnicko ime: ");
        nova.add(nK.korIme = sc.nextLine() + " ");
        System.out.println("Unesite zeljenu sifru za korisnika: ");
        nova.add(nK.password = sc.nextLine() + " ");
        nova.toString();

        try (FileWriter fileWriter = new FileWriter("korisnici.txt")) {
            for (int c = 0; c < stara.size(); c++) {
                System.out.println("Stari unos!");
                fileWriter.append(stara.get(c).toString());
            }
            for (int i = 0; i < nova.size(); i++) {
                System.out.println("Nov unos");
                fileWriter.append(nova.get(i).toString() + "\r");

            }
        }
        /*try {
         File myObj = new File("korisnici.txt");
         Scanner myReader = new Scanner(myObj);
         while (myReader.hasNextLine()) {
         String data = myReader.nextLine();
         System.out.println("Elementi ove liste su: ");
         System.out.println(data);
         }
         myReader.close();
         } catch (FileNotFoundException e) {
         System.out.println("Greska se desila.");
         e.printStackTrace();
         }*/
    }

    public static void prijavaKorisnika() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite sifru: ");
        String password = sc.nextLine();
        if (password.equals("82000")) {
            System.out.println("Zdravo Aleksa");
            System.out.println("Izaberite opcije: ");
            System.out.println("1. Ispis radnik / 2. Upis novih radnika");
            int operacija = sc.nextInt();
            if (operacija == 1) {
                upis.ispisRadnika();
            } else if (operacija == 2) {
                upis.novRadnik();
            }
        } else if (password.equals("82100")) {
            System.out.println("Zdravo Djordje");
            System.out.println("Izaberite opcije: ");
            System.out.println("1. Ispis radnik / 2. Upis novih radnika");
            int operacija = sc.nextInt();
            if (operacija == 1) {
                upis.ispisRadnika();
            } else if (operacija == 2) {
                upis.novRadnik();
            }
        }
    }

    public static String prijavaAdmin() throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Unesite lozinku: ");
        String unos = sc.nextLine();

        korisnici delete = new korisnici();
        if (unos.equals("admin")) {
            System.out.println("Zdravo Admine");
            System.out.println("Izaberite opcije: ");
            System.out.println("1. Ispis radnika, 2.Unos radnika, 3.Brisanje radnika, 4. Prikaz korisnika, 5. Prijave radnika, 6. Odjave radnika");

            int broj = sc.nextInt();
            if (broj == 1) {
                upis.ispisRadnika();
            } else if (broj == 2) {
                upis.novRadnik();
            } else if (broj == 3) {
                List nova = new ArrayList();
                List stara = new ArrayList();

                System.out.println("Upisite ime radnika kojeg zelite da izbrisete:");
                delete.ime = sc1.nextLine();
                System.out.println("Upisite prezime radnika kojeg zelite da izbrisete: ");
                delete.prezime = sc1.nextLine();
                System.out.println("Upisite id radnika kojeg zelite da izbrisete: ");
                delete.id = sc1.nextLine();
                nova.add(delete.ime);
                nova.add(delete.prezime);
                nova.add(delete.id);

                nova.toString();

                String radnik = "Ime: " + delete.ime + " Prezime:" + delete.prezime + " Id:" + delete.id;
                upis.removeLine(nova.toString());

            } else if (broj == 4) {
                System.out.println("Ovo su svi korisnici: ");
                korisnici.ispisKorisnika();
            }
            else if(broj == 5){ 
                System.out.println("Prijave svih korisnika: ");
                korisnici.ispisprijavaRadnika();
                
            }
            else if(broj == 6){
                System.out.println("Odjave svih korisnika: ");
                korisnici.ispisodjavaRadnika();
            }

        }
        return "Ime:" + delete.ime + " Prezime:" + delete.prezime + " Id:" + delete.id;

    }

    public static void ispisKorisnika() {
        try {
            File myObj1 = new File("korisnici.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }
    }
    public static void ispisprijavaRadnika(){
        try {
            File myObj1 = new File("prijavaRadnika.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }
    }
    public static void ispisodjavaRadnika(){
        try {
            File myObj1 = new File("odjavaRadnika.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "korisnici{" + "korIme=" + korIme + ", password=" + password + '}';
    }

}
