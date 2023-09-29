public class FindCenterofStarGraph {
    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        System.out.println(FindCenterofStarGraph.findCenter(edges));
    }

    private static int findCenter(int[][] edges) {

        int centerStar = edges[0][0];
        if(centerStar != edges[1][0] && centerStar != edges[1][1])  return edges[0][1];
        else return  centerStar;
    }


}

/*
There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
Example 2:

Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
 */
