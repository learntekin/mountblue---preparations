import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String s;
    static int hash[];
    public static void main(String[] args) {
       hash=new int[26];
       Scanner sc = new Scanner(System.in); 
       s=sc.next();
       s.toUpperCase();
       int i;
       for(i=0;i<s.length();i++)
       {
           int temp;
           temp=s.charAt(i)-'a';
           
           hash[temp]=hash[temp]+1;
       }
       int odd=0; 
       int set=0;
       for(i=0;i<26;i++)
        {
            if(hash[i]%2!=0)
            {
                if(odd==1){set=1;break;}
                else odd=1;
            }
        }
       if(set==0)
           System.out.println("YES");
       else if(set==1)
                   System.out.println("NO");
    }
}







