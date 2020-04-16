package advancedvezbe;

public class Kurs {

    String naziv;
    int trajanje;
    int cena;
    int brPolaznika;

    public Kurs(String naziv, int trajanje, int cena, int brPolaznika) {
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.cena = cena;
        this.brPolaznika = brPolaznika;
    }

    public Kurs() {
    }

    public  void prikazi() {
        System.out.println("Naziv kursa je: "+naziv+" Trajanje kursa je: "+trajanje+ " Cena kursa je: "+cena+ " Broj polaznika je: "+brPolaznika);
    }

}
