package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());
        int number[] = new int[t];
        int sum[] = new int[t];
        int result = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            number[i] = Integer.parseInt(st.nextToken());
            sum[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < t; i++) {
            if (i == 0) {
                sum[i] = number[i];
            } else {
                sum[i] = Math.max(sum[i - 1] + number[i], number[i]);
            }
            if(result < sum[i]){result = sum[i];}

        }


        System.out.println(result);
    }
}


