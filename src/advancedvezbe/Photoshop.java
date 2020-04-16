package advancedvezbe;

public class Photoshop extends Kurs {
    String dizajn;
    
public Photoshop(String naziv, int trajanje, int cena, int brPolaznika, String dizajn){
    super(naziv, trajanje, cena, brPolaznika);
    this.dizajn = dizajn;
}
@Override
public void prikazi(){
    System.out.println("Naziv kursa je: "+ naziv+ " Trajanje kursa je: "+trajanje+ " Cena kursa je: "+cena + " Broj polaznika je: "+brPolaznika);
    System.out.println("Dizajn kursa je: "+dizajn);
}
}
