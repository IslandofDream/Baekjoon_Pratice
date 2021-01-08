package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());

        int number [] = new int[t];
        int dp[] = new int[t];

        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<t; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i<t; i++){
            dp[i] = number[i];
            for(int j = 0; j<i; j++){
                if(number[i] > number[j] && dp[i] < dp[j] + number[i]){
                    dp[i] = dp[j] + number[i] ;
                }
            }
            if(max < dp[i]){
                max = dp[i];
            }
        }

        System.out.println(max);

    }
}


