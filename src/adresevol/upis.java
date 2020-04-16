package adresevol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class upis extends korisnici {

    String ime;
    String prezime;
    String id;

    public upis(String ime, String prezime, String id) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public upis() {
    }

    public static void novRadnik() throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        List nova = new ArrayList();
        List stara = new ArrayList();
        try {

            File myObj = new File("adresevol1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println("Elementi ove liste su: ");
                stara.add(data);
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }

        System.out.println("Koliko osoba zelite da unesete: ");

        int broj = sc.nextInt();
        upis nu = new upis();
        Date d = new Date();
        for (int i = 0; i < broj; i++) {

            System.out.println("Upisite ime: ");
            nu.ime = sc1.nextLine();
            nova.add("Ime: " + nu.ime + " \n");
            System.out.println("Unesite prezime: ");
            nu.prezime = sc1.nextLine();
            nova.add("Prezime: " + nu.prezime + " \n");
            System.out.println("Unesite id: ");
            nu.id = sc1.nextLine();
            nova.add("Id: " + nu.id + " \n");
            nova.toString();
            System.out.println("Vreme upisa u fajl je: " + d);

        }

        System.out.println("Konacni elementi liste: ");
        for (int y = 0; y < nova.size(); y++) {

            System.out.println(nova.get(y) + " ");
        }

        try (FileWriter fileWriter = new FileWriter("adresevol1.txt")) {
            for (int c = 0; c < stara.size(); c++) {
                //System.out.println("Stari unos!");
                fileWriter.append(stara.get(c).toString());
            }
            for (int i = 0; i < nova.size(); i++) {
                //System.out.println("Nov unos");
                fileWriter.append(nova.get(i).toString());

            }
        }

        try {
            File myObj1 = new File("adresevol1.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println("Elementi ove liste su: ");
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }
    }

    public static void ispisRadnika() {
        try {
            File myObj1 = new File("adresevol1.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Radnici su: ");
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Greska se desila.");
            e.printStackTrace();
        }
    }

    public static void removeLine(String id) throws IOException {

        File file = new File("adresevol1.txt");
        File temp = new File("temp.txt");
        PrintWriter out = new PrintWriter(new FileWriter(temp));
        Files.lines(file.toPath())
                .filter(line -> !line.contains(id))
                .forEach(out::println);
        out.flush();
        out.close();
        temp.renameTo(file);
    }

    public static void prijavaRadnik() throws IOException {
        Date d = new Date();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("1. Prijava, 2. Odjava");
        int broj = sc.nextInt();
        if (broj == 1) {
            List nova = new ArrayList();
            List stara = new ArrayList();
            try {

                File myObj = new File("prijavaRadnika.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    stara.add(data);

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Greska se desila.");
                e.printStackTrace();
            }
            upis pR = new upis();
            System.out.println("Upisite ime: ");
            pR.ime = sc1.nextLine();
            nova.add(pR.ime + " ");
            System.out.println("Upisite prezime: ");
            pR.prezime = sc1.nextLine();
            nova.add(pR.prezime + " ");
            System.out.println("Upisite id: ");
            pR.id = sc1.nextLine();
            nova.add(pR.id + " ");
            nova.add(d + " ");
            nova.toString();

            System.out.println("Vreme prijave je: " + d);
            try (FileWriter fileWriter = new FileWriter("prijavaRadnika.txt")) {
                for (int c = 0; c < stara.size(); c++) {
                    //System.out.println("Stari unos!");
                    fileWriter.append(stara.get(c).toString());
                }
                for (int i = 0; i < nova.size(); i++) {
                    //System.out.println("Nov unos");
                    fileWriter.append(nova.get(i).toString());

                }
            }

            try {
                File myObj1 = new File("prijavaRadnika.txt");
                Scanner myReader = new Scanner(myObj1);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    //System.out.println("Elementi ove liste su: ");
                    //System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Greska se desila.");
                e.printStackTrace();
            }
        } else if (broj == 2) {
            Date d1 = new Date();

            List nova = new ArrayList();
            List stara = new ArrayList();
            try {

                File myObj = new File("odjavaRadnika.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    stara.add(data);

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Greska se desila.");
                e.printStackTrace();
            }
            upis oR = new upis();
            System.out.println("Upisite ime: ");
            oR.ime = sc1.nextLine();
            nova.add(oR.ime + " ");
            System.out.println("Upisite prezime: ");
            oR.prezime = sc1.nextLine();
            nova.add(oR.prezime + " ");
            System.out.println("Upisite id: ");
            oR.id = sc1.nextLine();
            nova.add(oR.id + " ");
            nova.add(d + " ");
            nova.toString();

            System.out.println("Vreme odjave je: " + d);
            try (FileWriter fileWriter = new FileWriter("odjavaRadnika.txt")) {
                for (int c = 0; c < stara.size(); c++) {

                    fileWriter.append(stara.get(c).toString());
                }
                for (int i = 0; i < nova.size(); i++) {

                    fileWriter.append(nova.get(i).toString());

                }
            }

            try {
                File myObj1 = new File("odjavaRadnika.txt");
                Scanner myReader = new Scanner(myObj1);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Greska se desila.");
                e.printStackTrace();
            }
        }

    }

    @Override

    public String toString() {
        return "Ime:" + ime + " Prezime:" + prezime + " Id:" + id;
    }

}
