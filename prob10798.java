package exception.eechasequence;

import java.io.*;

public class prob10798 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] =new String[5];
        int len[] = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = br.readLine();
            len[i]= arr[i].length();
        }

        char brr[][] = new char[5][15];

        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                brr[i][j]='!';
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<len[i];j++){
                brr[i][j]=arr[i].charAt(j);
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(brr[j][i]!='!'){
                System.out.print(brr[j][i]);
                }
            }
        }
        
    }
}
