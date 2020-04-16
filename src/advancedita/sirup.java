package advancedita;

public class sirup extends Lek {

    String gustina;

    public sirup(String naziv, String dejstvo, int cena, String recept, String gustina) {
        super(naziv, dejstvo, cena, recept);
        this.gustina = gustina;
    }

    @Override
    public void ispis() {
        System.out.println("Naziv leka je: " + naziv);
        System.out.println("Dejstvo leka je: " + dejstvo);
        System.out.println("Cena leka je: " + cena);
        System.out.println("Recept je izdao: " + recept);
        System.out.println("Gustina sirupa je: "+gustina);
    }

}
