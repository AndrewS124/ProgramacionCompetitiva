import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problema5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cad1 = br.readLine();
        String cad2 = br.readLine();

        int[] a = Arrays.stream(cad1.split(" ")).mapToInt(Integer::parseInt).toArray();

        int participantes = a[0];
        int restriccion = a[1];

        int[] puntuaciones = new int[participantes];
        int pasaron = 0;

        for (int i = 0; i < participantes; i++){
            puntuaciones = Arrays.stream(cad2.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (puntuaciones[i] >= puntuaciones[restriccion-1] && puntuaciones[i] >0){
                pasaron++;
            }
        }

        System.out.println(pasaron);

    }
}
