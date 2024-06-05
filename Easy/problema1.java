import java.util.Scanner;


public class problema1 {
    public static void main(String[] args) {
        
        String a,b;
        Scanner sc = new Scanner (System.in);
        a = sc.nextLine();
        b = sc.nextLine();
        
        int resultado = a.compareToIgnoreCase(b);

        if(resultado < 0) System.out.println("-1");
        else if (resultado > 0 ) System.out.println("1");
        else if (resultado == 0 ) System.out.println("0");

        sc.close();
        
    }
    
}
