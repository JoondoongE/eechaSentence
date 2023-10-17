package exception.eechasequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob2563 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char array[][] = new char[100][100];
        int brr[][] = new int[n][2];
        int count=0;

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                array[i][j]='w';
            }
        }

        for(int i=0;i<n;i++){
                String str[] = br.readLine().split(" ");
                brr[i][0] = Integer.parseInt(str[0]);
                brr[i][1] = Integer.parseInt(str[1]);
        }

        for(int k=0;k<n;k++){
            for(int i = 100-(brr[k][1]+10);i<100-(brr[k][1]);i++){
                for(int j=brr[k][0];j<brr[k][0]+10;j++){
                    array[i][j]='b';
                }
            }
        }

         for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(array[i][j]=='b'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}