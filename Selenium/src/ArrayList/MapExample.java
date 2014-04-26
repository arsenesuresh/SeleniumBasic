package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		//Map<Object,string> is d syntax
		map.put("5", "apple");//to add key value pair in map
		map.put("6", "orange");//6 is key and orange is value
		map.put("7", "banana");
		for(String key:map.keySet()){//iterating through map using for loop
			//System.out.println(map.get(key));//to print value
			System.out.println(key.toString());//to print key
		}

	}

}
