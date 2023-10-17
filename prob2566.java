package exception.eechasequence;

import java.io.*;

public class prob2566 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[][] = new int[9][9];
        int max=0;
        int brr[] = new int[2];
        for(int i=0;i<9;i++){
            String str[] = br.readLine().split(" ");
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j]>=max){
                    max = arr[i][j];
                    brr[0]=i+1;
                    brr[1] =j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(brr[0]+" "+brr[1]);
    }
}
