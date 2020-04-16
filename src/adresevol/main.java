package adresevol;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Pozdrav!");
        System.out.println("Da li zelite novi nalog ili prijavu: ");
        String unos = sc.nextLine();
        if(unos.equals("Novi")|| unos.equals("novi")||unos.equals("NOVI")){
            korisnici.novKorisnik();
        }
        else if(unos.equals("Prijava")|| unos.equals("prijava")|| unos.equals("PRIJAVA")){
            System.out.print("Upisiti korisnicko ime: ");
            String user = sc.nextLine();
            if(user.equals("Aleksa")){
                korisnici.prijavaKorisnika();
            }
            else if(user.equals("Djordje")){
                korisnici.prijavaKorisnika();
            }
            else if(user.equals("ADMIN")|| user.equals("Admin")|| user.equals("admin")){
                korisnici.prijavaAdmin();
            }
            else if(user.equals("radnik")){
                upis.prijavaRadnik();
            }
        }
        else{
            System.out.println("Uneli ste nepostojucu operaciju!");
        }    
        
        
        
    }
    
}
