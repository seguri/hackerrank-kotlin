package name.seguri.java.leetcode._110;

import static name.seguri.java.leetcode._110.TreeNode.of;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var root = of(3, 9, 20, null, null, 15, 7);

    var result = sut.isBalanced(root);

    assertThat(result).isTrue();
  }

  @Test
  void input2() {
    var root = of(1, 2, 2, 3, 3, null, null, 4, 4);

    var result = sut.isBalanced(root);

    assertThat(result).isFalse();
  }

  @Test
  void input3() {
    var result = sut.isBalanced(null);

    assertThat(result).isTrue();
  }

  @Test
  void input4() {
    var root = of(1, 2, 2, 3, null, null, 3, 4, null, null, 4);

    var result = sut.isBalanced(root);

    assertThat(result).isFalse();
  }
}
