package advancedita;

public class pomagala extends Lek {

    String opis;

    public pomagala(String naziv, String dejstvo, int cena, String recept, String opis) {
        super(naziv, dejstvo, cena, recept);
        this.opis = opis;
    }

    @Override
    public void ispis() {
        System.out.println("Naziv leka je: " + naziv);
        System.out.println("Dejstvo leka je: " + dejstvo);
        System.out.println("Cena leka je: " + cena);
        System.out.println("Recept je izdao: " + recept);
        System.out.println("Opis pomagala: "+opis);
    }
}
