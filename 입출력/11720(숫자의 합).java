import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int result = 0;
        String st;
        n = sc.nextInt();

        st = sc.next();

        for(int i = 0; i < n; i++){

            result += st.charAt(i) - '0';
        }
        System.out.println(result);
        }
    }
