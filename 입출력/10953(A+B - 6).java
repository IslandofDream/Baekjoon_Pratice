import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();

        for(int i=0; i<n+1; i++) {

                String st;
                st = sc.nextLine();
                int a = 0;
                int b = 0;

                StringTokenizer sto = new StringTokenizer(st, ",");
                int count = sto.countTokens();
                for(int j =0; j<count; j++){
                    if (j==0){
                        a = Integer.parseInt(sto.nextToken());
                        if(a <0 || a >9){
                            break;
                        }
                    }
                    else{
                        b = Integer.parseInt(sto.nextToken());
                        if(b <0 || b> 9){
                            break;
                        }
                        System.out.println(a + b);
                    }

                }
                if((a <0 || a >9) ||(b <0 || b> 9)){
                    break;
                        }


                /*a = sc.nextInt();
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

                 */



        }
    }
}
