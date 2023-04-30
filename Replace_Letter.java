import java.io.*;
import java.util.*;
 
public class Replace_Letter {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(reader.readLine());
 
		for (int i = 0; i < numCases; i++) {
			String s1 = reader.readLine();
			String s2 = reader.readLine();
 
			if (s2.equals("a")) {
				System.out.println(1);
			} else if (s2.contains("a")) {
				System.out.println(-1);
			} else {
				System.out.println((long)Math.pow(2, s1.length()));
			}
		}
	}
}