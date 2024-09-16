package name.seguri.java.leetcode._1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var input = new int[] {2, 7, 11, 15};

    var result = sut.twoSum(input, 9);

    assertThat(result).containsExactly(0, 1);
  }

  @Test
  void input2() {
    var input = new int[] {3, 2, 4};

    var result = sut.twoSum(input, 6);

    assertThat(result).containsExactly(1, 2);
  }

  @Test
  void input3() {
    var input = new int[] {3, 3};

    var result = sut.twoSum(input, 6);

    assertThat(result).containsExactly(0, 1);
  }
}
