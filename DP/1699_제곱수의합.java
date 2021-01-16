package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int dp[] = new int[t+1];

        for(int i = 1; i<=t; i++){
            dp[i] = i;
            for(int j = 1; j*j<=i; j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }

        System.out.println(dp[t]);
    }
}


