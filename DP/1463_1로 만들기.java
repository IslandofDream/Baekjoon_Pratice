import java.util.Scanner;
import java.lang.Math;



public class Main {

    public static int one(int n){
        int num[] = new int[n+1];
        num[0] = 0;
        num[1] = 0;

        for(int i=2; i<=n; i++){

            num[i] = num[i-1] + 1;
            if(i%2 == 0){ num[i] = Math.min(num[i], num[i/2]+1); }
            if(i%3 == 0){ num[i] = Math.min(num[i], num[i/3]+1); }

        }
        return num[n];
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(one(n));

    }
}

