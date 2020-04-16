package advancedvezbe;

public class Java extends Kurs {
String programiranje;

public Java(String naziv, int trajanje, int cena, int brPolaznika, String programiranje) {
    super(naziv, trajanje, cena, brPolaznika);
    this.programiranje = programiranje;
}
@Override
public void prikazi(){
    System.out.println("Naziv kursa je: "+naziv+ " Trajenje kursa je: "+trajanje+ " Cena kursa je: "+cena+ " Broj polaznika je: "+brPolaznika);
    System.out.println("Vrsta programiranja je: "+programiranje);
}
    
}
