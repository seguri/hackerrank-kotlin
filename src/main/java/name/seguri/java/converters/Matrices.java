package name.seguri.java.converters;

public class Matrices {

  /** Parses a matrix like {@code "[[1,1,1],[1,1,0],[1,0,1]]"} */
  public static int[][] parse(String text) {
    // Remove the outer brackets
    text = text.substring(2, text.length() - 2);

    // Split the string by "],["
    String[] rows = text.split("],\\s*\\[");

    // Initialize the result array
    int[][] matrix = new int[rows.length][];

    for (int row = 0; row < rows.length; row++) {
      // Split each row by commas
      String[] cols = rows[row].split(",");
      matrix[row] = new int[cols.length];

      for (int col = 0; col < cols.length; col++) {
        // Convert each element to an integer
        matrix[row][col] = Integer.parseInt(cols[col]);
      }
    }

    return matrix;
  }
}
