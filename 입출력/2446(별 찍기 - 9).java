import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        if (n > 0 && n < 101) {
            for (int i = 1; i <= 2 * n - 1; i++) {
                if(i < ((2*n)-1)/2+1) {
                    for (int j = 2*n -1 ; j > 0; j--) {
                        if (j > (2*n-1)-i+1) {
                            System.out.print(" ");
                        }
                        else if(j <= i-1){break;}
                        else {
                            System.out.print("*");
                        }
                    }
                }
                else if( i > (2*n-1)/2 + 1){
                    for (int j = 0; j < 2*n-1; j++) {
                        if(j < (2*n-1)-i){
                            System.out.print(" ");}
                        else if(j >= i ){break;}
                        else{System.out.print("*");}
                    }
                }

                else{
                    for(int j = 0; j<2*n-1; j++) {
                        if(j >= ((2*n)-1)/2  && j < (((2*n)-1)/2)+1){
                        System.out.print("*");}
                        else if(j >= ((2*n)-1)/2){break;}
                        else {System.out.print(" ");}
                    }
                }

                if(i == 2*n-1){}
                else{System.out.println("");}

            }
        }
    }
}

