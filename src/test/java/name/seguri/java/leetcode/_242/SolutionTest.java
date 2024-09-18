package name.seguri.java.leetcode._242;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution sut = new Solution();

  @Test
  void input1() {
    var result = sut.isAnagram("anagram", "nagaram");

    assertThat(result).isTrue();
  }

  @Test
  void input2() {
    var result = sut.isAnagram("rat", "car");

    assertThat(result).isFalse();
  }
}
