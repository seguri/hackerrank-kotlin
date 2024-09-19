package name.seguri.java.leetcode._733;

import static org.assertj.core.api.Assertions.assertThat;

import name.seguri.java.converters.Matrices;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var image = Matrices.parse("[[1,1,1],[1,1,0],[1,0,1]]");

    var result = sut.floodFill(image, 1, 1, 2);

    assertThat(result[0]).containsExactly(2, 2, 2);
    assertThat(result[1]).containsExactly(2, 2, 0);
    assertThat(result[2]).containsExactly(2, 0, 1);
  }

  @Test
  void input2() {
    var image = Matrices.parse("[[0,0,0],[0,0,0]]");

    var result = sut.floodFill(image, 0, 0, 0);

    assertThat(result[0]).containsExactly(0, 0, 0);
    assertThat(result[1]).containsExactly(0, 0, 0);
  }
}
