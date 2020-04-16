package vezbeinternet;

public class Ocena1 {
    private String ime, prezime, predmet;
    private int ocena;
    public Ocena1(String ime, String prezime, String predmet, int ocena ){
        this.ime = ime;
        this.prezime = prezime;
        this.predmet = predmet;
        this.ocena = ocena;
    }
    public static double srednjaOcena(Ocena1 niz[], String predmet){
        double vr = 0; int broj = 0;
        for(int i = 0; i < niz.length; i++){
            if(niz[i].predmet.equals(predmet)){
                vr+= niz[i].dohvatiOcenu();
                broj++;
            }
        }
        return vr/broj;
    }
    public double dohvatiOcenu(){
        return ocena;
    }
    public static void main(String[] args){
        Ocena1 niz[] = new Ocena1[4];
        niz[0] = new Ocena1("Aleks", "Ristic", "Programiranje", 8);
        niz[1] = new Ocena1("Djordje", "Stamenkovic", "Programiranje", 9);
        niz[2] = new Ocena1("Filipe", "Krstic", "Fizika", 7);
        niz[3] = new Ocena1("Katarina", "Jovanic", "Fizika", 9);
        System.out.println(srednjaOcena(niz, "Programiranje"));
        System.out.println(srednjaOcena(niz, "Fizika"));
    }
}
