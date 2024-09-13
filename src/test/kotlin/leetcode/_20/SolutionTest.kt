package leetcode._20

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

  private val sut = Solution()

  @Test
  fun input1() {
    val input = "()"

    val result = sut.isValid(input)

    assertThat(result).isTrue()
  }

  @Test
  fun input2() {
    val input = "()[]{}"

    val result = sut.isValid(input)

    assertThat(result).isTrue()
  }

  @Test
  fun input3() {
    val input = "(]"

    val result = sut.isValid(input)

    assertThat(result).isFalse()
  }

  @Test
  fun input4() {
    val input = "([])"

    val result = sut.isValid(input)

    assertThat(result).isTrue()
  }

  @Test
  fun input5() {
    val input = "["

    val result = sut.isValid(input)

    assertThat(result).isFalse()
  }
}
