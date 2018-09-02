package Debug;
import java.util.*;

public class String_Desc {

	public static void main(String[] args) {
		String[] arr = {"India", "Pakistan", "China", "Afghanistan", "Iran"};
		System.out.println(String_build(arr));
	}
	
	public static List<String> String_build(String[] arr) {
		List<String> list = new LinkedList<>();
		for(String word:arr) {
			list.add(word);
		}
		 Collections.sort(list, (String a, String b) -> a.length()>b.length()?-1:a.length()<b.length()?1:0);
		
	return list;
	}
	
	

}
