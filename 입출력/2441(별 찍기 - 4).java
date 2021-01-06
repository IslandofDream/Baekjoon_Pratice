
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for(int i = n; i>0; i--){
            for(int j = n; j>0; j--) {
                if(j <= i){
                    System.out.print("*");
                }
                else{System.out.print(" ");}

            }
            System.out.println("");
        }

    }
}

