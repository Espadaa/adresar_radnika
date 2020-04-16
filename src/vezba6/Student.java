package vezba6;

public class Student extends Osoba {

    int brIndeksa;

    public Student(int brIndeksa, String ime, String prezime, int godine, int tezina, int visina) {
        super(ime, prezime, godine, tezina, visina);
        this.brIndeksa = brIndeksa;
    }

    public Student() {

    }

    @Override
    public void prikazi() {
        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godine i tezina: " + godine + " " + tezina);
        System.out.println("Br indeksa: " + brIndeksa);
    }

}
