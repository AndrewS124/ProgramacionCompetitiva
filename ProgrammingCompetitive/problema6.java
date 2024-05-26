import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problema6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        //cont fichas
        String entrada = br.readLine();

        String[] tamMatriz = entrada.split(" ");

        int filas = Integer.parseInt(tamMatriz[0]);
        int columnas = Integer.parseInt(tamMatriz[1]);

        int fichasIngresada = (filas*columnas)/2;

        System.out.println(fichasIngresada);

    }
}
