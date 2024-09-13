package leetcode._1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  private val sut = Solution()

  @Test
  fun input1() {
    val input = intArrayOf(2, 7, 11, 15)

    val result: IntArray = sut.twoSum(input, 9)

    assertThat(result).containsExactly(0, 1)
  }

  @Test
  fun input2() {
    val input = intArrayOf(3, 2, 4)

    val result: IntArray = sut.twoSum(input, 6)

    assertThat(result).containsExactly(1, 2)
  }

  @Test
  fun input3() {
    val input = intArrayOf(3, 3)

    val result: IntArray = sut.twoSum(input, 6)

    assertThat(result).containsExactly(0, 1)
  }
}
