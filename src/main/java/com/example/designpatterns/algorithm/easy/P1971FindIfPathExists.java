package com.example.designpatterns.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

public class P1971FindIfPathExists {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        List<List<Integer>> graph = buildGraph(n, edges);
        boolean[] visited = new boolean[graph.size()];
        return dfs(source, destination, graph, visited);
    }

    private static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
        return graph;
    }

    private static boolean dfs(int node, int target, List<List<Integer>> graph, boolean[] visited) {
        if (node == target) return true;
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor] && dfs(neighbor, target, graph, visited)) {
                return true;
            }
        }
        return false;
    }
}
