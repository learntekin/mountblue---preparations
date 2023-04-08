import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> scores = new Stack<>();
        scores.push(in.nextInt());
        for (int i = 1; i < n; i++) {
            int cur = in.nextInt();
            if (!scores.peek().equals(cur)) scores.push(cur);
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int cur = in.nextInt();
            while (scores.size() > 0 && cur > scores.peek()) scores.pop();
            System.out.println(scores.size() +(scores.size() > 0 && scores.peek().equals(cur) ? 0 : 1));
        }
    }
}








