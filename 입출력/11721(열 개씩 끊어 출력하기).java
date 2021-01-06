import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st;
        st = sc.nextLine();
        for(int i = 0; i<(st.length()/10)+1; i++){
            if(i == st.length()/10){
                System.out.println(st.substring((i*10), st.length()));
            }
            else {
                System.out.println(st.substring((i * 10), ((i + 1) * 10)));
            }
        }

        }
    }
