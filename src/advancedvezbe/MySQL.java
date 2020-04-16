package advancedvezbe;

public class MySQL extends Kurs {
    String baza;
    
public MySQL (String naziv, int trajanje, int cena, int brPolaznika, String baza ){
    super(naziv, trajanje, cena, brPolaznika);
    this.baza = baza;
}
@Override
    public void prikazi(){
        System.out.println("Naziv kursa je: "+naziv+ " Trajanje kursa je: "+trajanje+ " Cena kursa je: "+cena+" Broj polaznika je: "+brPolaznika);
        System.out.println("Baza koja se radi je: "+baza);
    }
}
