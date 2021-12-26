import java.util.*;
import java.io.*;


public class Maze {
    private static int row;
    private static int col;
    private static String[][] maze;

    public Maze(int row, int col) {
        //call function
        this.row = row;
        this.col = col;
        this.maze = new String[row][col];
    }


    public static void main(String[] args) throws FileNotFoundException {
        File newFile = new File("..\\Algo_Assignemtn\\src\\mapName.txt");
        Scanner scan = new Scanner(newFile);
        String[] arrRow = scan.nextLine().split(" ");
        row = Integer.parseInt(arrRow[0]);
        col = Integer.parseInt(arrRow[1]);

        Maze maze = new Maze(row, col);
        System.out.print(row + " " + col + "\n");
        for (int i = 0; i < row; i++) {
            String line = scan.nextLine();
            String[] temp = line.split(" ");
            for (int j = 0; j < col; j++) {
                maze.maze[i][j] = temp[j];
            }
        }

        //display maze
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(maze.maze[i][j]+" ");
            }
            System.out.println();
        }

    }
}


