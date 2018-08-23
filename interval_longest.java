package Debug;
import java.util.*;
public class interval_longest {

	public static void main(String[] args) {
		char[] tasks = {'A','C','C','C','E','E','E'};
		System.out.println(leastInterval(tasks,2));
	}
	public static int leastInterval(char[] tasks, int n) {

        int[] c = new int[26];
        for(char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i >= 0 && c[i] == c[25]) i--;

        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
    }
}
