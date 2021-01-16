package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long dp[][] = new long[k+1][n+1];

        for(int i = 1; i<=k; i++){
            for(int j = 0; j<=n; j++){
                if(i == 1){dp[i][j] = 1;}
                for(int l = 0; l<=j; l++){
                    dp[i][j] +=dp[i-1][l];
                }
                dp[i][j] %= 1000000000;
            }
        }

        System.out.println(dp[k][n]);
    }
}


