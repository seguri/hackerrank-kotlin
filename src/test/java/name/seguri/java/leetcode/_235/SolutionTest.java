package name.seguri.java.leetcode._235;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.lowestCommonAncestor(2, 8, 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);

    assertThat(result).isNotNull().hasFieldOrPropertyWithValue("val", 6);
  }

  @Test
  void input2() {
    var result = sut.lowestCommonAncestor(2, 4, 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);

    assertThat(result).isNotNull().hasFieldOrPropertyWithValue("val", 2);
  }

  @Test
  void input3() {
    var result = sut.lowestCommonAncestor(2, 1, 2, 1);

    assertThat(result).isNotNull().hasFieldOrPropertyWithValue("val", 2);
  }
}
