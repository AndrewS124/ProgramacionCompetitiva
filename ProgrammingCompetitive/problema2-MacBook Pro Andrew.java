import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class problema2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numPalabras = Integer.parseInt(br.readLine());

        String[] palabras = new String[numPalabras];

        for (int i = 0; i < numPalabras; i++) {

            palabras[i] = br.readLine();
            
        }

        for (int i = 0; i < numPalabras; i++) {

            if(palabras[i].length() <= 10){
                System.out.println(palabras[i]);
            }else {
                int tamPalabra = palabras[i].length() - 2;
                System.out.print(palabras[i].charAt(0));
                System.out.print(tamPalabra);
                System.out.print(palabras[i].charAt(tamPalabra+1));
                System.out.println();
            }

        }

        scanner.close();

    }

}
