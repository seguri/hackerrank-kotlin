package name.seguri.kotlin.leetcode._226

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

  private val sut = Solution()

  @Test
  fun input1() {
    val result = sut.invertTree(4, 2, 7, 1, 3, 6, 9)
    assertThat(result.toString()).isEqualTo("[4, 7, 2, 9, 6, 3, 1]")
  }

  @Test
  fun input2() {
    val result = sut.invertTree(2, 1, 3)
    assertThat(result.toString()).isEqualTo("[2, 3, 1]")
  }

  @Test
  fun input3() {
    val result = sut.invertTree()
    assertThat(result).isNull()
  }
}
