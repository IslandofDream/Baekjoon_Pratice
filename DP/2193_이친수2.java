
import java.util.Scanner;

public class Main {
    static long number[][] = new long[1001][10];

    public static long cal(int level , int num){

        long sum = 0;

            number[1][1] = 1;
            number[2][0] = 1;

        for(int i=3; i<=level; i++){
            for(int j = 0; j<num; j++){
                    if(j == 0) { number[i][j] += number[i-1][0] + number[i-1][1]; }
                    else if(j == 1){ number[i][j] += number[i-1][0];}
            }
        }

        for(int k =0; k<num; k++){
            sum += number[level][k];
        }
        return sum;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println(cal(n,2));
    }
}

