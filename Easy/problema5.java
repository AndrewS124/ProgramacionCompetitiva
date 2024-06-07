import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problema5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numPiedras = Integer.parseInt(br.readLine());
        char[] colores = br.readLine().toCharArray();
        int cont = 0;
        for(int i = 0; i < numPiedras-1; i++){
            if(colores[i] == colores[i+1]) cont++;
        }
       System.out.println(cont);

    }
}
