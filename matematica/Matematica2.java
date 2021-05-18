package matematica;
import java.util.Scanner;

public class Matematica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        a = input.nextInt();
        b = input.nextInt();

        if (a < b) {
            if (a % 2 == 0) {
            for (int i = a + 1; i <= b; i = i + 2) {
                System.out.println(i);
            }
            } else {
                for (int i = a; i <= b; i = i + 2) {
                    System.out.println(i);
                }
            }
        } else {
            if (b % 2 == 0) {
            for (int i = b + 1; i <= a; i = i + 2) {
                System.out.println(i);
            }
            } else {
                for (int i = b; i <= a; i = i + 2) {
                    System.out.println(i);
                }
            }
        }
        

        input.close();
    }
}
