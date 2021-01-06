package com.company;

import java.util.Scanner;

public class Main {
    static int number[][] = new int[1001][10];

    public static int cal(int level , int num){

        int sum = 0;
        for(int i =0; i<10; i++){
            number[1][i] = 1;
        }

        for(int i=2; i<=level; i++){
            for(int j = 0; j<num; j++){
               for(int n=9; n>=j; n--){
                   number[i][j] += (number[i-1][n])%10007;
               }
            }
        }

        for(int k =0; k<10; k++){
            sum += number[level][k];
        }
        return sum;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println(cal(n,10)%10007);
    }
}
