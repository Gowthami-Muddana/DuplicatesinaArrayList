package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesinaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Banana");
		l.add("Mango");
		l.add("Apple");
//	        System.out.println(l.toString());  
		Set<String> s = new LinkedHashSet<String>(l);
//	        System.out.println(s);  
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		
//		 List<String> listWithoutDuplicates = l.stream().distinct().collect(Collectors.toList());
		}

	}
}
