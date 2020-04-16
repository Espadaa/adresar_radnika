package advancedita;

public class vozila {

    String marka;
    int cena;
    String boja;
    String tip;

    public vozila(String marka, int cena, String boja, String tip) {
        this.marka = marka;
        this.cena = cena;
        this.boja = boja;
        this.tip = tip;
    }

    public vozila() {
    }

    public void podaci() {
        System.out.println("Marka je: " + marka);
        System.out.println("Cena je: " + cena);
        System.out.println("Boja je: " + boja);
        System.out.println("Tip je: " + tip);

    }
}
