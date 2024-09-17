package name.seguri.java.leetcode._21;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var list1 = ListNode.of(1, 2, 4);
    var list2 = ListNode.of(1, 3, 4);

    var result = sut.mergeTwoLists(list1, list2);

    assertThat(result).isNotNull();
    assertThat(result.toString()).isEqualTo("[1, 1, 2, 3, 4, 4]");
  }

  @Test
  void input2() {
    ListNode list1 = null;
    ListNode list2 = null;

    var result = sut.mergeTwoLists(list1, list2);

    assertThat(result).isNull();
  }

  @Test
  void input3() {
    var list1 = ListNode.of();
    var list2 = ListNode.of(0);

    var result = sut.mergeTwoLists(list1, list2);

    assertThat(result).isNotNull();
  }

  @Test
  void toString1() {
    var list1 = ListNode.of(1, 2, 4);

    var result = list1.toString();

    assertThat(result).isEqualTo("[1, 2, 4]");
  }

  @Test
  void toString2() {
    var list1 = ListNode.of(0);

    var result = list1.toString();

    assertThat(result).isEqualTo("[0]");
  }
}
