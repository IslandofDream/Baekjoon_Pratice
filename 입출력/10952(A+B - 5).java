import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<100000; i++) {


                int a, b;

                a = sc.nextInt();
                if(a <0 || a >9){
                    break;
                }
                b = sc.nextInt();
                if(b <0 || b> 9){
                    break;
                }

                if (a == 0 && b == 0) {
                    break;
                }
            System.out.println(a + b);
        }
    }
}
