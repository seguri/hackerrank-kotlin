package name.seguri.kotlin.leetcode._121

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

  private val sut = Solution()

  @Test
  fun input1() {
    var input = intArrayOf(7, 1, 5, 3, 6, 4)

    var result = sut.maxProfit(input)

    assertThat(result).isEqualTo(5)
  }

  @Test
  fun input2() {
    var input = intArrayOf(7, 6, 4, 3, 1)

    var result = sut.maxProfit(input)

    assertThat(result).isEqualTo(0)
  }
}
