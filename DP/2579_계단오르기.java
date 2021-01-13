package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int number[] = new int[t];
        int dp[] = new int[t];


        for (int i = 0; i < t; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }


        dp[0] = number[0];
        if(t>1){ dp[1] = number[0]+ number[1];}
        if(t>2){dp[2] = Math.max(number[0],number[1]) + number[2];}
        for(int i=3; i<t; i++){
            dp[i] = Math.max(dp[i-2] +number[i] ,dp[i-3] + number[i]+number[i-1]);
        }


        System.out.println(dp[t-1]);
    }
}


