package name.seguri.kotlin.leetcode._704

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

  private val sut = Solution()

  @Test
  fun input1() {
    val result = sut.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)

    assertThat(result).isEqualTo(4)
  }

  @Test
  fun input2() {
    val result = sut.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)

    assertThat(result).isEqualTo(-1)
  }
}
