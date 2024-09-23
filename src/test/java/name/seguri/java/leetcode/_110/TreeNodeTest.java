package name.seguri.java.leetcode._110;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

  @Test
  void builder1() {
    var result = TreeNode.of(1, 2, 2, 3, null, null, 3, 4, null, null, 4);

    assertThat(result.toString()).isEqualTo("[1, 2, 2, 3, 3, 4, 4]");
  }
}
