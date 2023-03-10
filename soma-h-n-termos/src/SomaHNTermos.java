import java.util.Scanner;

public class SomaHNTermos {
    public static void main(String[] args) throws Exception {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        System.out.println(Math.round(h));

        sc.close();
    }
}
