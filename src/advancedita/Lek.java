package advancedita;

public class Lek {
String naziv;
String dejstvo;
int cena;
String recept;

public Lek(String naziv, String dejstvo, int cena, String recept){
    this.naziv = naziv;
    this.dejstvo = dejstvo;
    this.cena = cena;
    this.recept = recept;
}
public void ispis(){
    System.out.println("Naziv leka je: "+naziv);
    System.out.println("Dejstvo leka je: "+ dejstvo);
    System.out.println("Cena leka je: "+cena);
    System.out.println("Recept je izdao: "+recept);
}
}
