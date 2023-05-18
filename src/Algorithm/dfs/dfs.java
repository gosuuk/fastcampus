package src.Algorithm.dfs;

import java.util.*;

public class dfs {
    static int[][] direction = {
            {-1,0}, {1,0}, {0,-1}, {0, 1}
    };

    static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());

        int [][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        for (int i =0; i<N; i++) {
            String s = scanner.nextLine();
            for (int j =0; j<N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i =0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    size = 1;
                    dfs(N, map, visited, i, j);
                    result.add(size);
                }
            }
        }
        System.out.println(result.size());
        Collections.sort(result);
        result.forEach(i -> System.out.println(i));
    }
    public static void dfs(int N, int[][] map, boolean[][] visited, int x, int y) {
        visited[x][y] = true;
        for (int i =0; i<direction.length; i++) {
            int nX = x +direction[i][0];
            int nY = y +direction[i][1];
            if (nX >= 0 && nY >= 0 && nX <N && nY < N
                    && map[nX][nY]==1 && !visited[nX][nY]) {
                size += 1;
                dfs(N, map, visited, nX, nY);
            }
        }
    }
}
