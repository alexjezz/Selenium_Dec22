package Week3_Day2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounts {

	public static void main(String[] args) {
		
		String company = "amazon developement centre";
		char[] CharArray = company.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<CharArray.length; i++) {
			
			if(map.containsKey(CharArray[i])) {
				Integer Count1 = map.get(CharArray[i]);
				map.put(CharArray[i], Count1+1);
			}else {	
				map.put(CharArray[i], 1);
			}
		}
		System.out.println(map);	
	}

}
