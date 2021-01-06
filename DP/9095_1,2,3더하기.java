package com.company;

import java.util.Scanner;




public class Main {
    static int result[] = new int[1001];

    public static int cal(int n){

        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        if(result[n] != 0 ){
            return  result[n];
        }
        else {
            result[n] = (cal(n - 1) + cal(n - 2) + cal(n-3)) % 10007;
        }

        return result[n];
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            System.out.println(cal(num));
        }


    }
}

