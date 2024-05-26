import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problema4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numDeclaraciones =  Integer.parseInt(br.readLine());

        int salida = 0;

        ArrayList<String> declaraciones = new ArrayList<>();

        for(int i = 0; i < numDeclaraciones; i++){
            declaraciones.add(br.readLine());
        }

        //System.out.println(declaraciones);

        br.close();

        for (String declaracion : declaraciones) {
            if (declaracion.contains("+")) {
                salida++;
            } else if (declaracion.contains("-")) {
                salida--;
            }
        }

        System.out.println(salida);

    }
}
