//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//
//public class problema3 {
//
//    public static void main(String[] args) throws IOException {
//
//        //num problemas
//        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
//        int numProblemas = Integer.parseInt(br.readLine());
//        int cont = 0;
//        int problemasAresolver = 0;
//        //Por por cada problema se guarda si cada una lo puede resolver o no
//        for (int i = 0; i < numProblemas; i++){
//            String habilidad = br.readLine();
//            String[] habilidadGrupo = habilidad.split(" ");
////            System.out.println(Arrays.toString(habilidadGrupo));
//
//            for (String s : habilidadGrupo) {
//                if (Integer.parseInt(s) == 1) {
//                    cont++;
//                }
//            }
//
//            if(cont >= 2){
//                //num de problemas a resolver
//                problemasAresolver++;
//            }
//
//            cont = 0;
//        }
//
//        System.out.println(problemasAresolver);
//
//    }
//
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problema3 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numProblemas = Integer.parseInt(br.readLine());
            int problemasAresolver = contarProblemasResolvibles(br, numProblemas);
            System.out.println(problemasAresolver);
        }
    }

    private static int contarProblemasResolvibles(BufferedReader br, int numProblemas) throws IOException {
        int problemasAresolver = 0;
        for (int i = 0; i < numProblemas; i++) {
            String habilidades = br.readLine();
            int[] habilidadesGrupo = Arrays.stream(habilidades.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println(Arrays.toString(habilidadesGrupo));
            if (contarHabilidades(habilidadesGrupo) >= 2) {
                problemasAresolver++;
            }
        }
        return problemasAresolver;
    }

    private static int contarHabilidades(int[] habilidadesGrupo) {
        int cont = 0;
        for (int habilidad : habilidadesGrupo) {
            if (habilidad == 1) {
                cont++;
            }
        }
        return cont;
    }
}
