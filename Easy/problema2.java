import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class problema2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();

        char[] letras = entrada.toCharArray();

        Set<Character> caracteresUnicos = new HashSet<Character>();
        
        for(int i =0; i < letras.length; i++){
            caracteresUnicos.add(letras[i]);
        }

        int tamanioTotal = caracteresUnicos.size();

        if ((tamanioTotal%2)==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        
        
    }

}
