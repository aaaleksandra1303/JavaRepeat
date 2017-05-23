package Collections;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {
		// MapExample key and value
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		maps.put("cat", 5);
		maps.put("dog", 2);
		
		
		System.out.println("Map size is "+maps.size());
		
		for(String key:maps.keySet()){
			System.out.println("Word "+key + " appear in the text "+maps.get(key)+" times");
		}

	}

}
