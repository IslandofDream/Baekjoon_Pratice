import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.StringTokenizer;


public class Main {




    public static void main(String[] args) throws IOException,NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){// 테스트 케이스 시도 횟수
            int num = Integer.parseInt(br.readLine());
            int number[][] = new int[2][num+1]; // 원본 배열
            int score[][] = new int[2][num+1]; // 점수를 저장할 배열


            for(int k = 0; k<2; k++){
                st = new StringTokenizer(br.readLine());
                for(int j =1; j<=num; j++){
                    number[k][j] = Integer.parseInt(st.nextToken());
                }
            }

            score[0][1] = number[0][1];
            score[1][1] = number[1][1];

            for (int j = 2; j<=num; j++){
                score[0][j] = number[0][j] + Math.max(score[1][j-1] , score[1][j-2]);
                score[1][j] = number[1][j] + Math.max(score[0][j-1] , score[0][j-2]);
            }

            System.out.println(Math.max(score[0][num], score[1][num]));
        }

    }
}

