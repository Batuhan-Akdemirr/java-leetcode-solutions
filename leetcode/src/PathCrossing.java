import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {

        System.out.println(PathCrossing.isPathCrossing("NNSWWEWSSESSWENNW"));
    }

    private static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;

        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;
            }

            visited.add(currentPosition);
        }

        return false;
    }
}


/*
Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.



Example 1:


Input: path = "NES"
Output: false
Explanation: Notice that the path doesn't cross any point more than once.
Example 2:


Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
 */
