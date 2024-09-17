package name.seguri.kotlin.leetcode._21

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

  private val sut = Solution()

  @Test
  fun input1() {
    val list1 = ListNode.of(1, 2, 4)
    val list2 = ListNode.of(1, 3, 4)

    val result = sut.mergeTwoLists(list1, list2)

    assertThat(result).isNotNull
    assertThat(result.toString()).isEqualTo("[1, 1, 2, 3, 4, 4]")
  }

  @Test
  fun input2() {
    val list1: ListNode? = null
    val list2: ListNode? = null

    val result = sut.mergeTwoLists(list1, list2)

    assertThat(result).isNull()
  }

  @Test
  fun input3() {
    val list1 = ListNode.of()
    val list2 = ListNode.of(0)

    val result = sut.mergeTwoLists(list1, list2)

    assertThat(result).isNotNull
  }

  @Test
  fun toString1() {
    val list1 = ListNode.of(1, 2, 4)

    val result = list1.toString()

    assertThat(result).isEqualTo("[1, 2, 4]")
  }

  @Test
  fun toString2() {
    val list1 = ListNode.of(0)

    val result = list1.toString()

    assertThat(result).isEqualTo("[0]")
  }
}
