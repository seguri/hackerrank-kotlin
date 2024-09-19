package name.seguri.java.leetcode._733;

class Solution {

  /**
   * Given:
   *
   * <ul>
   *   <li>image has size m x n, where m and n are positive
   * </ul>
   */
  public int[][] floodFill(int[][] image, int row, int col, int targetColor) {
    // Check if we can start the flooding process
    if (image[row][col] == targetColor) {
      return image;
    }

    return floodFill(image, row, col, image[row][col], targetColor);
  }

  private int[][] floodFill(int[][] image, int row, int col, int startColor, int targetColor) {
    var m = image.length;
    var n = image[0].length;

    // Avoid IndexOutOfBoundsException
    if (row < 0 || row >= m || col < 0 || col >= n) {
      return image;
    }

    // Check if it can be flooded
    if (image[row][col] != startColor) {
      return image;
    }

    // Check if already flooded
    if (image[row][col] == targetColor) {
      return image;
    }

    image[row][col] = targetColor;
    floodFill(image, row - 1, col, startColor, targetColor);
    floodFill(image, row + 1, col, startColor, targetColor);
    floodFill(image, row, col - 1, startColor, targetColor);
    floodFill(image, row, col + 1, startColor, targetColor);

    return image;
  }
}
