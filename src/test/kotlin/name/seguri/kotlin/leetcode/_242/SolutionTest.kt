package name.seguri.kotlin.leetcode._242

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  private val sut = Solution()

  @Test
  fun input1() {
    val result = sut.isAnagram("anagram", "nagaram")
    assertThat(result).isTrue()
  }

  @Test
  fun input2() {
    val result = sut.isAnagram("rat", "car")
    assertThat(result).isFalse()
  }
}
