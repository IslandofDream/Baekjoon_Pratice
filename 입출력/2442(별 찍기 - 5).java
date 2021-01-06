import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = ((2 * n) - 1); j > 0; j--) {
                    if (j - 1 > (((2 * n) - 1) / 2) - (i) && j - 1 < (((2 * n) - 1) / 2) + (i)) {
                        System.out.print("*");
                    }
                    else if(j < (((2 * n) - 1) / 2) + (i)) {
                        break;
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                if (i == n) {
                } else {
                    System.out.println("");
                }

            }

    }
}

