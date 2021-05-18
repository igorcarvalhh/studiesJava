package matematica;
import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        a = input.nextInt();
        b = input.nextInt();

        if (a % 2 == 0) {
            for (int i = a + 1; i <= b; i = i + 2) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i = i + 2) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
