package name.seguri.java.leetcode._704;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.search(new int[] {-1, 0, 3, 5, 9, 12}, 9);

    assertThat(result).isEqualTo(4);
  }

  @Test
  void input2() {
    var result = sut.search(new int[] {-1, 0, 3, 5, 9, 12}, 2);

    assertThat(result).isEqualTo(-1);
  }
}
