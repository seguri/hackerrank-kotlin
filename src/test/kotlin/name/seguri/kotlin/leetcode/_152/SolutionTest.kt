package name.seguri.kotlin.leetcode._152

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  private val sut = Solution()

  @Test
  fun input3() {
    val input = intArrayOf(0, 1, -1)

    val result = sut.maxProduct(input)

    assertThat(result).isEqualTo(1)
  }

  @Test
  fun input9() {
    val input = intArrayOf(-4, -2, 0, 1, 9)

    val result = sut.maxProduct(input)

    assertThat(result).isEqualTo(9)
  }

  @Test
  fun input10() {
    val input = intArrayOf(-4, -2, -1, 0, 1)

    val result = sut.maxProduct(input)

    assertThat(result).isEqualTo(8)
  }

  @Test
  fun input11() {
    val input = intArrayOf(-4, -2, -6, 0, 1)

    val result = sut.maxProduct(input)

    assertThat(result).isEqualTo(12)
  }
}
