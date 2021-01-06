package com.company;

import java.util.Scanner;




public class Main {
    static long number[][] = new long[101][10];

    public static long cal(int level , int num){

        long sum = 0;
        for(int i =1; i<10; i++){
            number[1][i] = 1;
        }

        for(int i=2; i<=level; i++){
            for(int j = 0; j<num; j++){
                if(j == 0){
                    number[i][j] = (number[i-1][1])%1000000000;
                }
                else if(j == 9){
                    number[i][j] = (number[i-1][8])%1000000000;
                }
                else{
                    number[i][j] = (number[i-1][j+1] + number[i-1][j-1])%1000000000;
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
            System.out.println(cal(n,10)%1000000000);
    }
}

