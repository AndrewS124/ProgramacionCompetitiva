import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problema6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coords = Integer.parseInt(br.readLine());
        double pasos = Integer.MAX_VALUE;

        for(double i = 1; i<=5; i++){

                double cont = coords/i;
                if(cont<pasos){
                    pasos = cont;
                }
            
        }

        //System.out.println(String.format("%.0f", Math.ceil(pasos)));
        System.out.println(((int)Math.ceil(pasos)));
        

    }
}
