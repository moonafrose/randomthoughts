import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        Direction direction = Direction.LEFT; // initial direction to start with

        while (rowStart <= rowEnd && colStart <= colEnd) {
            if (direction == Direction.LEFT) {
                for (int i = colStart; i <= colEnd; i++) {
                    result.add(matrix[rowStart][i]);
                }
                rowStart++;
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN) {
                for (int i = rowStart; i <= rowEnd; i++) {
                    result.add(matrix[i][colEnd]);
                }
                colEnd--;
                direction = Direction.RIGHT;
            } else if (direction == Direction.RIGHT) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
                direction = Direction.UP;
            } else {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                    colStart++;
                }
                direction = Direction.LEFT;
            }
        }
        return result;

    }

    enum Direction {
        LEFT, DOWN, RIGHT, UP
    }
}