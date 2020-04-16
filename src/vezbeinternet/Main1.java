package vezbeinternet;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zaposleni z = new Zaposleni("Aleksa", "Ristic", "Programer", 1000);
        System.out.println(z.DohvatiPlatu());
        System.out.println(z);
        z.postaviPlatu(1200);
        System.out.println(z.DohvatiPlatu());
        System.out.println(z);

    }
}
