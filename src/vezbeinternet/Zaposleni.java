package vezbeinternet;

public class Zaposleni {
private String ime, prezime, zanimanje;
private double plata;

public Zaposleni(String ime, String prezime, String zanimanje, double plata){
    this.ime = ime;
    this.prezime = prezime;
    this.zanimanje = zanimanje;
    this.plata = plata;
    
}
public String DohvatiIme(){
    return ime;
}
public String DohvatiPrezime (){
    return prezime;
}
public String DohvatiZanimanje(){
    return zanimanje;
}
public double DohvatiPlatu (){
    return plata;
}
public void postaviPlatu(double plata){
    this.plata = plata;
}
public void PostaviZanimanje(){
    this.zanimanje = zanimanje;
}
public String toString(){
    String s = "Podaci o zaposlenim";
    s += (ime + " "+ prezime + " "+ zanimanje+ " "+ plata);
    return s;
}
}
