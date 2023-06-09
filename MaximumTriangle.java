import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        int ans = -1;
        for (int i = 2; i < n; i++) {
            if (a[i-2]+a[i-1]>a[i])
                ans = i;
        }
        if (ans == -1)
            System.out.println(-1);
        else
            System.out.println(a[ans-2]+" "+a[ans-1]+" "+a[ans]);
    }
}
                  