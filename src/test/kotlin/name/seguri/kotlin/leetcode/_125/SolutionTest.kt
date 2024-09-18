package name.seguri.kotlin.leetcode._125

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  private val sut = Solution()

  @Test
  fun input1() {
    val result = sut.isPalindrome("A man, a plan, a canal: Panama")
    assertThat(result).isTrue()
  }

  @Test
  fun input2() {
    val result = sut.isPalindrome("race a car")
    assertThat(result).isFalse()
  }

  @Test
  fun input3() {
    val result = sut.isPalindrome(" ")
    assertThat(result).isTrue()
  }
}
