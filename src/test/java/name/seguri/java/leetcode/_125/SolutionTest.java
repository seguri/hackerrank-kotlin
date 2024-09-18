package name.seguri.java.leetcode._125;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.isPalindrome("A man, a plan, a canal: Panama");

    assertThat(result).isTrue();
  }

  @Test
  void input2() {
    var result = sut.isPalindrome("race a car");

    assertThat(result).isFalse();
  }

  @Test
  void input3() {
    var result = sut.isPalindrome(" ");

    assertThat(result).isTrue();
  }
}
