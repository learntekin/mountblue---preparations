


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlipMatrix {

    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        for(int t1=0;t1<t;t1++){
            int n=Integer.parseInt(in.readLine());
            String[][] s=new String[2*n][2*n];
            for(int i=0;i<2*n;i++)
                s[i]=in.readLine().split(" ");
            long sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum+=Math.max(Math.max(Integer.parseInt(s[i][j]),
                                  Integer.parseInt(s[2*n-1-i][j])),
                                  Math.max(Integer.parseInt(s[i][2*n-1-j]),
                                  Integer.parseInt(s[2*n-1-i][2*n-1-j])));
                }
            }
            System.out.println(sum);
        }
    }
}







