package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int dp[] = new int[t];

        if(t>2 && t%2==0){

            for(int i = 4; i<t; i++){
                dp[i] = 3*dp[i-2];
                for(int j=0;j<i-2;j+=2) { 
                    dp[i]+=dp[j] * 2; 
                }
            }
        }
        else{
            System.out.println(0);
        }

        System.out.println(dp[t]);
    }
}


