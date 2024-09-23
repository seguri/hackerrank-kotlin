package name.seguri.java.leetcode._141;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.hasCycle(ListNode.of(1, 3, 2, 0, -4));

    assertThat(result).isTrue();
  }

  @Test
  void input2() {
    var result = sut.hasCycle(ListNode.of(0, 1, 2));

    assertThat(result).isTrue();
  }

  @Test
  void input3() {
    var result = sut.hasCycle(ListNode.of(-1, 1));

    assertThat(result).isFalse();
  }
}
