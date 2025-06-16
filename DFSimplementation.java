package javaprojects;

import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class DFSimplementation {
    private Map<String, List<String>> homemap = new HashMap<>();
    private Set<String> visited = (Set<String>) new HashSet<String>();

    public void assRoom(String room, String crooms) {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(crooms);
        homemap.computeIfAbsent(crooms, k -> new ArrayList<>()).add(room);
    }

    public void dfs(String crr) {
        if (visited.contains(crr)) return;
        visited.add(crr);
        System.out.println("Visited: " + crr);
        for (String neighbor : homemap.getOrDefault(crr, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSimplementation obj = new DFSimplementation();
        obj.assRoom("person1", "person2");
        obj.assRoom("person1", "person3");
        obj.assRoom("person3", "person4");

        obj.dfs("person1");
    }
}
