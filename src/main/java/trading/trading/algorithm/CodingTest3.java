package trading.trading.algorithm;

import java.util.*;

public class CodingTest3 {

    public static void main(String[] args) {
        String L1 = "..xx.x.";
        String L2 = "x.x.x..";

        System.out.println(solution(L1, L2));
    }

    public static int solution(String L1, String L2) {
        String[] arr1 = L1.split("");
        String[] arr2 = L2.split("");
        boolean[] vistied = new boolean[arr1.length - 1 + arr2.length - 1];
        int[][] graph;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return 0;
    }


    public static void dfs(int nodeIndex, boolean[] vistied, int[][] graph) {
        vistied[nodeIndex] = true;
        System.out.print(nodeIndex + " -> ");
        for (int node : graph[nodeIndex]) {
            if (!vistied[node]) {
                dfs(node, vistied, graph);
            }
        }
    }

}

