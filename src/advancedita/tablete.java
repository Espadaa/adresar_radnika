package advancedita;

public class tablete extends Lek {
int miligrami;

public tablete(String naziv, String dejstvo, int cena, String recept, int miligrami){
    super(naziv, dejstvo, cena, recept);
    this.miligrami = miligrami;
}

@Override
public void ispis(){
    System.out.println("Naziv leka je: "+naziv);
    System.out.println("Dejstvo leka je: "+ dejstvo);
    System.out.println("Cena leka je: "+cena);
    System.out.println("Recept je izdao: "+recept);
    System.out.println("Gramaza leka je: "+ miligrami);
}    

}
