
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        if (n > 0 && n < 101) {
            for (int i = 1; i <= 2 * n - 1; i++) {
                if(i < ((2*n)-1)/2 +1) {
                    for (int j = n; j > 0; j--) {
                        if (j <= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                else if( i > (2*n-1)/2 + 1){
                    for (int j = 0; j < n; j++) {
                        if(j < i-n){
                            System.out.print(" ");}
                        else{System.out.print("*");}
                    }
                }

                else{
                    for(int j = 0; j<n; j++) {
                        System.out.print("*");
                    }
                }

                if(i == 2*n-1){}
                else{System.out.println("");}

            }
        }
    }
}

