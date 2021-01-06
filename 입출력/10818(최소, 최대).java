import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        int min,max;
        int result = 0;
        n = sc.nextInt();

        int [] numbers = new int[n];

        for(int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        min = numbers[0];
        max = numbers[0];
        for(int i = 0; i<n; i++){
            if(i > 0){
                if(min > numbers[i]){
                    min = numbers[i];
                }
                if(max < numbers[i]){
                    max = numbers[i];
                }
            }
            else{}

        }
            System.out.println((min + " " + max));


    }
}

