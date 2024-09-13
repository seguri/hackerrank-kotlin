package leetcode._20;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JavaSolutionTest {

  private final JavaSolution sut = new JavaSolution();

  @Test
  void input1() {
    var input = "()";

    var result = sut.isValid(input);

    assertThat(result).isTrue();
  }

  @Test
  void input2() {
    var input = "()[]{}";

    var result = sut.isValid(input);

    assertThat(result).isTrue();
  }

  @Test
  void input3() {
    var input = "(]";

    var result = sut.isValid(input);

    assertThat(result).isFalse();
  }

  @Test
  void input4() {
    var input = "([])";

    var result = sut.isValid(input);

    assertThat(result).isTrue();
  }

  @Test
  void input5() {
    var input = "[";

    var result = sut.isValid(input);

    assertThat(result).isFalse();
  }
}
