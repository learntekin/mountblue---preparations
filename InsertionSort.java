
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int ar[]=new int[s];
        boolean check=false;
        for(int i=0;i<s;i++)
        {
            ar[i]=scan.nextInt();
        }
        int var=ar[s-1];
        for(int i=s-2;i>=-1;i--)
        {
            if(i!=-1)
            {
            if(var<ar[i])
            {
                ar[i+1]=ar[i];
            }
            else
            {
                ar[i+1]=var;
                check=true;
            }
            }
            else
            {
                ar[0]=var;
            }
            for(int j=0;j<s;j++)
                System.out.print(ar[j]+" ");
            System.out.println();
            if(check)
                break;
        }
    }
}






