package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    static long dp[]= new long [101];


    public static long padovan(int n){
        if (n == 1 || n == 2 || n == 3) {
            return 1;
        }
        else if(dp[n] == 0){
            for(int i = 4; i<=n; i++){
                dp[i] = dp[i-3] +dp[i-2];
            }
            return dp[n];
        }
        else{
            return dp[n];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(padovan(n));
        }
    }
}


