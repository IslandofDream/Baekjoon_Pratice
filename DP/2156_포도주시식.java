package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int wine[] = new int[t+1];
        int drink[] = new int[t+1];
        for(int i = 1; i<=t; i++){// 테스트 케이스 시도 횟수
                int temp = Integer.parseInt(br.readLine());
                wine[i] = temp;
        }

        drink[1] = wine[1];

        if(t>1){ drink[2] = wine[2]+wine[1];}

        for(int j = 3; j<=t; j++){
            drink[j] = Math.max(drink[j-2]+wine[j], Math.max(drink[j-1] , drink[j-3] + wine[j-1]+wine[j]));
        }


        System.out.println(drink[t]);
    }
}

