package name.seguri.java.leetcode._226;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.invertTree(4, 2, 7, 1, 3, 6, 9);

    assertThat(result.toString()).isEqualTo("[4, 7, 2, 9, 6, 3, 1]");
  }

  @Test
  void input2() {
    var result = sut.invertTree(2, 1, 3);

    assertThat(result.toString()).isEqualTo("[2, 3, 1]");
  }

  @Test
  void input3() {
    var result = sut.invertTree();

    assertThat(result).isNull();
  }
}
