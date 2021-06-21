package javaStudy;
import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultEx {
	public static void main(String[] args) { 
		String[] ex = {"A", "B", "C", "A" };
		
		Map<String, Integer> map = new HashMap<>(); 
		for(String str : ex) map.put(str, map.getOrDefault(str, 0)+1);
		
		System.out.println(":: MAIN :: " + map);
		
	}
}
