package Week3_Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		String name = "google";
		char[] data = name.toCharArray();
		Set<Character> remove = new LinkedHashSet<Character>();
		for (int i=0; i<data.length; i++) {
			remove.add(data[i]);
		}
		System.out.println(remove);	
	}

}
