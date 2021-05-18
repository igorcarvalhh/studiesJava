package matematica;
import java.util.Scanner;

public class Matematica3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int[] m = order(a, b);
        
        a = m[0];
        b = m[1];

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

    public static int[] order(int x, int y) {
        int[] myList = {0,0};
        myList[0] = x;
        if (y < myList[0]) {
            myList[1] = myList[0];
            myList[0] = y;
        } else {
            myList[1] = y;
        }

        return myList;
    }
}
