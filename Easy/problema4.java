import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problema4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pesos = br.readLine();

        int pesoL = Integer.parseInt(pesos.split(" ")[0]);
        int pesoB = Integer.parseInt(pesos.split(" ")[1]);

        int anios = 0;

        while (pesoL<=pesoB) {
            pesoL = pesoL * 3;
            pesoB = pesoB * 2;
            anios++;
        }

        System.out.println(anios);
        

    }
}
