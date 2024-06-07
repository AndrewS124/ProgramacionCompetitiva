import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class problema1 {
    public static void main(String[] args) throws IOException {
        
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String palabra =  reader.readLine();

       String resto = palabra.substring(1, palabra.length());
       char a = palabra.toUpperCase().charAt(0);

       System.out.println(a + resto);
       
       

    
        
    }
    
}
