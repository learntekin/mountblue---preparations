
import java.util.*;

public class SubArrayDivision {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = 0;
        
        for(int i = 0; i < n-m+1; i++){
            int tmpSum = 0;
            for(int j = i; j < i+m; j++){
                tmpSum+= squares[j];
            } 
            if(tmpSum == d){
                result++;
            }
        }
        System.out.println(result);
        
    }
}





