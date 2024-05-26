import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("unused")
public class problema1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pesoFruta = scanner.nextInt();
        scanner.close();

        if (pesoFruta <= 2 || pesoFruta % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
