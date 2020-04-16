package adrese;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class unosPodataka {

    String ime;
    String prezime;
    String id;

    public unosPodataka(String ime, String prezime, String id) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
    }

    public unosPodataka() {
    }

    public static void main(String[] args) throws IOException {

        List unosPodataka;
        unosPodataka = new ArrayList();

        unosPodataka unosPodataka1 = new unosPodataka("Aleksa", "Ristic", "1");
        unosPodataka.add(unosPodataka1);
        unosPodataka unosPodataka2 = new unosPodataka("Djordje", "Stamenkovic", "2");
        unosPodataka.add(unosPodataka2);
        unosPodataka unosPodataka3 = new unosPodataka("Filip", "Krstic", "3");
        unosPodataka.add(unosPodataka3);
        unosPodataka unosPodataka4 = new unosPodataka("Katarina", "Jovanic", "4");
        unosPodataka.add(unosPodataka4);
        unosPodataka unosPodataka5 = new unosPodataka("Jovan", "Jeremic", "5");
        unosPodataka.add(unosPodataka5);
        unosPodataka unosPodataka6 = new unosPodataka("Jelena", "Kostic", "6");
        unosPodataka.add(unosPodataka6);
        unosPodataka unosPodataka7 = new unosPodataka("Nebojsha", "Ristic", "7");
        unosPodataka.add(unosPodataka7);

        try (FileWriter fileWriter = new FileWriter("adresirani.txt")) {
            for (int i = 0; i < unosPodataka.size(); i++) {
                System.out.println("Nov unos");
                fileWriter.append(unosPodataka.get(i).toString());

            }
            System.out.println("Elementi liste su:");
            for (int i = 0; i < unosPodataka.size(); i++) {
                System.out.println(unosPodataka.get(i) + " ");
            }
        }

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Koliko osoba zelite da unesete: ");
        int brojac = sc.nextInt();
        List novaLista = new ArrayList();

        for (int i = 0; i < brojac; i++) {
            try (FileWriter f = new FileWriter("adresirani.txt")) {

                for (int y = 0; y < novaLista.size(); y++) {
                    System.out.println("Nov unos");
                    f.append(unosPodataka.get(y).toString());
                }
                    unosPodataka novUnos = new unosPodataka();

                    System.out.println("Unesite ime: ");
                    novUnos.ime = sc1.nextLine();
                    
                    System.out.println("Unesi prezime: ");
                    novUnos.prezime = sc1.nextLine();

                    System.out.println("Unesi id: ");
                    novUnos.id = sc1.nextLine();

                    novUnos.toString();
                    System.out.println("Uneti su podaci o osobi: " + novUnos);

                    novaLista.add(novUnos);
                    System.out.println("Elementi liste su:");
                    for (int z = 0; z < novaLista.size(); z++) {
                        System.out.println(novaLista.get(z) + " ");
                    }
                    System.out.println("Uneta nova lista: " + novaLista);
                    unosPodataka.add(novaLista.toString());
                    System.out.println("Uneta u prvobitnu listu: " + unosPodataka);

                }
            //f.append(unosPodataka.toString());
                //f.close();
            }

        }
    

    @Override
    public String toString() {
        return "unosPodataka{" + "ime=" + ime + ", prezime=" + prezime + ", id=" + id + '}';

    }

}
