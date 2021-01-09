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
        int dp2[] = new int[t];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<t; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i<t; i++){
            dp[i] = 1;

            for(int j = 0; j<i; j++){
                    if(number[i] > number[j] && dp[i] < dp[j] + 1 ){
                        dp[i] = dp[j] + 1 ; // 증가하는 배열 검사
                    }

                }

        }

        for(int i = t -1; i>=0; i--){

            dp2[i] = 1;
            for(int j = t -1; j > i; j--){
                if(number[j] < number[i] && dp2[i] < dp2[j] + 1){
                    dp2[i] = dp2[j] + 1 ; // 역순으로 검사
                }
            }
        }

        for(int i = 0; i<t; i++){
            if(max < dp[i]+dp2[i])
            max = dp[i]+ dp2[i];
        }

        System.out.println(max -1);

    }
}


