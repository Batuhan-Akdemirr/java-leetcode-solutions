import java.util.HashMap;
import java.util.Map;

public class FurthestPointFromOrigin {
    public static void main(String[] args) {
        System.out.println(FurthestPointFromOrigin.furthestDistanceFromOrigin("L_RL__R"));
    }

    private static int furthestDistanceFromOrigin(String moves) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<moves.length(); i++) {
            map.merge(moves.charAt(i), 1, Integer::sum);
        }

        int leftCount = map.getOrDefault('L', 0);
        int rightCount = map.getOrDefault('R', 0);
        int underscoreCount = map.getOrDefault('_', 0);

        if (leftCount == 0 && rightCount == 0) {
            return underscoreCount;
        }

        if (leftCount >= rightCount) {
            return Math.abs((-1 * (leftCount + underscoreCount)) + rightCount);
        } else {
            return (rightCount + underscoreCount) - leftCount;
        }
    }
}

/*
You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:

move to the left if moves[i] = 'L' or moves[i] = '_'
move to the right if moves[i] = 'R' or moves[i] = '_'
Return the distance from the origin of the furthest point you can get to after n moves.


Example 1:

Input: moves = "L_RL__R"
Output: 3
Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".
Example 2:

Input: moves = "_R__LL_"
Output: 5
Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".
Example 3:

Input: moves = "_______"
Output: 7
Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves "RRRRRRR".
 */