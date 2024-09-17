package name.seguri.java.leetcode._121;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var input = new int[] {7, 1, 5, 3, 6, 4};

    var result = sut.maxProfit(input);

    assertThat(result).isEqualTo(5);
  }

  @Test
  void input2() {
    var input = new int[] {7, 6, 4, 3, 1};

    var result = sut.maxProfit(input);

    assertThat(result).isEqualTo(0);
  }
}
