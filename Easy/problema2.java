import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class problema2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();
        String[] numeros = entrada.split("\\+");
       
        ArrayList<Integer> numer = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++) {
            numer.add(Integer.parseInt(numeros[i]));
        }
    
        //Collections.sort(numer);
        numer.sort(null);

        for (int j = 0; j < numer.size(); j++) {
            if(j == numer.size() - 1) System.out.print(numer.get(j));
            else System.out.print(numer.get(j) + "+"); 
        }
        
        System.out.println("");
    }

}
