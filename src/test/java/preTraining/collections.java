package preTraining;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.Stack;
//import java.util.Vector;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Collections {
	public static void main (String [] args) {
		
		System.out.println("----LIST----");
		
		List <String> list = new LinkedList<String>();
//		new ArrayList<String>();
//		new Vector<String>();
//		new Stack<String>();
		list.add("jeden");
		list.add("dwa");
		
		List <String> list2 = new LinkedList<String>();
//		new ArrayList<String>();
		list2.add("trzy");
		list2.addAll(list);
		list2.add("cztery");
		list2.add("cztery");
		
		System.out.println(list2);
		System.out.println("list2.contains(\"trzy\") = " + list2.contains("trzy"));
		System.out.println("list2.get(1) = " + list2.get(1));
		System.out.println("list.isEmpty() = " + list.isEmpty());
		System.out.println("list2.indexOf(\"cztery\") = " + list2.indexOf("cztery"));
		System.out.println("list2.lastIndexOf(\"cztery\") = " + list2.lastIndexOf("cztery"));
		System.out.println("list2.size() = " + list2.size());
		
		
		System.out.println();
		System.out.println("----SET----");
				
		Set <String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("three");
		set.add("one");
		set.add("four");
		
		Set <String> set2 = new HashSet<String>();
		set2.add("five");
		set2.addAll(set);
		set.add("one");
		set.add("one");
		set.add("one");
		set.add("six");
		
		System.out.println(set2);
		System.out.println("set2.isEmpty() = " + set2.isEmpty());
		System.out.println("set2.size() = " + set2.size());
		System.out.println("set2.contains(\'three\') = " + set2.contains("three"));
		
		
		System.out.println();
		System.out.println("----MAP----");
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("jeden", "pierwsza wartoœæ");
		map.put("dwa", "druga wartoœæ");
		map.put("trzy", "trzecia wartoœæ");
		
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("cztery",  "czwarta wartoœæ");
		map2.put("piêæ",  "druga wartoœæ");
		map2.putAll(map);
		
		System.out.println(map2);
		System.out.println("map2.isEmpty() = " + map2.isEmpty());
		System.out.println("map2.size() = " + map2.size());
		System.out.println("map2.get(\"trzy\") = " + map2.get("trzy"));
		System.out.println("map2.containsKey(\"jeden\") = " + map2.containsKey("jeden"));
		System.out.println("map2.containsValue(\"druga wartoœæ\") = " + map2.containsValue("druga wartoœæ"));
		map2.remove("jeden"); 
		System.out.println("map2.remove('jeden') = " + map2);
		
		
		
		
		
		
		
		
		
	}
}
