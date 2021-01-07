
import java.util.Scanner;

public class Main {
    static long number[] = new long[91];

    public static long cal(int num){


        number[0] = 1;
        number[1] = 1;

        for(int i=2; i<num; i++){
            number[i] = number[i-1] + number[i-2];
        }

        return number[num-1];
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println(cal(n));
    }
}

