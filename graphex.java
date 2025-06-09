package demo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
public class graphex {

	public static void main(String[] args) {
		Map<String,List<String>> m=new HashMap <>();
		m.put("Entrance",Arrays.asList("Reptile House","Bird Sanctuary","Mammal Zone"));
		m.put("Reptile House",Arrays.asList("Snake pit"));
		m.put("Bird Sanctuary",Arrays.asList("Parrot Pavilion"));
		m.put("Mammal Zone",Arrays.asList("Lion Den","Elephant Enclosure"));
		m.put("Parrot Pavilion",new ArrayList<String>());
		m.put("Lion Den",new ArrayList<String>());
		m.put("Elephant Enclosure",new ArrayList<String>());
        System.out.println("exploring the bfs:");
        bfs(m,"Entrance");
	}
	public static void bfs(Map<String,List<String>> m,String S) {
		Queue<String> q=new LinkedList<>();
		Set<String> s=new HashSet<>();
		q.add(S);
		s.add(S);
		while(!q.isEmpty()) {
			String S1=q.poll();
			System.out.println("visited"+S1);
			List<String>neighbor=m.get(S1);
			if (neighbor!=null) {
			    for(String n : m.get(S1)) {
				    if(!s.contains(n)) {
					    q.add(n);
					    s.add(n);
				}
			}
		}
		
	}

	}
}
