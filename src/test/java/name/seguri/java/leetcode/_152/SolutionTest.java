package name.seguri.java.leetcode._152;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution sut = new Solution();

  @Test
  void maxProduct_emptyArray_zero() {
    var input = new int[0];

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(0);
  }

  @Test
  void maxProduct_lengthOne_firstElement() {
    var random = new Random().nextInt();
    var input = new int[] {random};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(random);
  }

  @Test
  void input1() {
    var random = new Random().nextInt();
    var input = new int[] {0, random};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(Math.max(0, random));
  }

  @Test
  void input2() {
    var input = new int[] {1, 0};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void input3() {
    var input = new int[] {0, 1, -1};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void input4() {
    var input = new int[] {0, 1, 2, 3, 4};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(24);
  }

  @Test
  void input5() {
    var input = new int[] {1, 1, 1, 1};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void input6() {
    var input = new int[] {-4, 0};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(0);
  }

  @Test
  void input7() {
    var input = new int[] {-4, 0, 2, 2};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(4);
  }

  @Test
  void input8() {
    var input = new int[] {-4, -2, 0, 1};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(8);
  }

  @Test
  void input9() {
    var input = new int[] {-4, -2, 0, 1, 9};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(9);
  }

  @Test
  void input10() {
    var input = new int[] {-4, -2, -1, 0, 1};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(8);
  }

  @Test
  void input11() {
    var input = new int[] {-4, -2, -6, 0, 1};

    var result = sut.maxProduct(input);

    assertThat(result).isEqualTo(12);
  }
}
