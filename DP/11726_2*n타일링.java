import java.util.Scanner;

public class Main {
    static int result[] = new int[1001];

    public static int domino(int n){

        result[0] = 1;
        result[1] = 1;
        result[2] = 2;

        if(result[n] != 0){
            return result[n];
        }
        else{
            result[n] = (domino(n-1) + domino(n-2))%10007;
        }

        return result[n];
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(domino(n)%10007);

    }
}

