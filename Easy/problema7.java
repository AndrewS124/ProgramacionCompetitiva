import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class problema7 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[][] matriz = new int[5][5];


            String[] linea = new String[5];


            for(int i = 0; i < 5; i++){
                linea = br.readLine().split(" ");
                System.out.println(linea);
                for(int j = 0; j < 5; j++){
                  matriz[i][j] = Integer.parseInt(linea[i]);
                }
            }

            // for(int i = 0; i < 5; i++){
            //     for(int j = 0; j < 5; j++){
            //         System.out.println(matriz[i][j]);
            //     }
            //     System.out.println("\n");
            // }

    }
}
