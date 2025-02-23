//Question -> Rat in a Maze Problem - I
// Given a maze, NxN matrix. A rat is placed at maze[0][0]. The rat has to reach the last cell maze[N-1][N-1]. In the maze, 0 is blocked cell, and 1 is the valid cell. The rat can move in 4 directions: up, down, left, right.
// Write a function that returns a boolean value indicating weather it is possible to reach the last cell or not.

public class RatInMaze {

    public static boolean isSafe(int maze[][], int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1);
    }

    public static boolean ratInMaze(int maze[][], int row, int col, int sol[][]) {

        // base case
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        // recursion
        if (isSafe(maze, row, col)) {
            if (sol[row][col] == 1) {
                return false;
            }
            sol[row][col] = 1;
            if (ratInMaze(maze, row + 1, col, sol)) {
                return true;
            }
            if (ratInMaze(maze, row, col + 1, sol)) {
                return true;
            }
            sol[row][col] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int sol[][] = new int[maze.length][maze[0].length];
        if (ratInMaze(maze, 0, 0, sol)) {
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[0].length; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Solution doesn't exists!!");
        }
    }
}