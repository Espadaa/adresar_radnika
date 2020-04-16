package advancedita;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class reader {

    public static void main(String[] args)throws  IOException{
        FileOutputStream fos = new FileOutputStream("ispis.txt");
        fos.write(104);
        fos.write(101);
        fos.write(108);
        fos.write(108);
        fos.write(116);
        
        fos.close();
    }
}
