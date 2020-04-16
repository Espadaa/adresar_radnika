/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba6;

public class Osoba {

    String ime;
    String prezime;
    int godine;
    int tezina;
    int visina;
    
    public int idealnaTezina(){
       int idealnaTezina = visina - 100;
        
        return idealnaTezina;
           }
    
    public void prikazi() {
        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godine i tezina: " + godine + " " + tezina);
    }

    public Osoba(String ime, String prezime, int godine, int tezina, int visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.tezina = tezina;
        this.visina = visina;
    }

    public Osoba() {
    }

}
