
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SherlockBeast {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numCases = Integer.parseInt(in.readLine());
		for(int t = 0; t < numCases; t ++)
		{
			int k = Integer.parseInt(in.readLine());
			int numFives = (k / 3) * 3;
			int numThrees = 0;
			if(k-numFives == 2)
			{
				numFives -= 3;
				numThrees += 5;
			}
			else if(k-numFives == 1)
			{
				numFives -= 9;
				numThrees += 10;
			}
			
			if(numFives >= 0)
			{
				for(int i = 0; i < numFives; i ++)
				{
					out.append(5);
				}
				for(int i = 0; i < numThrees; i ++)
				{
					out.append(3);
				}
				out.append("\n");
			}
			else
			{
				out.append("-1\n");
			}
		}

		System.out.print(out);
	}
}
                    
