package exception.eechasequence;

import java.io.*;

public class prob2738 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int arr[][] = new int[N][M];
        int brr[][] = new int[N][M];
        
        for(int i=0;i<N;i++){
            String a[] = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(a[j]);
            }
        }
        for(int i=0;i<N;i++){
            String a[] = br.readLine().split(" ");
            for(int j=0;j<M;j++){
                brr[i][j] = Integer.parseInt(a[j]);
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[i][j]+brr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
