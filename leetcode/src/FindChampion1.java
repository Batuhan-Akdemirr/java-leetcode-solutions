public class FindChampion1 {
    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 1},
                {1, 0, 1},
                {0, 0, 0}

        };

        System.out.println(FindChampion1.findChampion(grid));
    }

    private static int findChampion(int[][] grid) {
        int teams = grid.length;
        for(int i=0; i<teams; i++){
            int count = 0;
            for(int j=0; j<teams;j++){
                if(i==j)
                    continue;
                if(grid[i][j] == 0)
                    break;
                count++;
            }
            if(count == teams - 1)
                return i;
        }
        return -1;
    }
}
