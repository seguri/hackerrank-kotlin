package name.seguri.java.leetcode._278;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import name.seguri.java.common.BaseTestCase;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class SolutionTest extends BaseTestCase {

  @Mock private VersionControl versionControl;

  @InjectMocks private Solution sut;

  @Test
  void input1() {
    int n = 5;
    int badVersion = 4;
    givenBadVersion(badVersion, n);

    var result = sut.firstBadVersion(n);

    assertThat(result).isEqualTo(badVersion);
  }

  @Test
  void input2() {
    int n = 1;
    int badVersion = 1;
    givenBadVersion(badVersion, n);

    var result = sut.firstBadVersion(n);

    assertThat(result).isEqualTo(badVersion);
  }

  private void givenBadVersion(int firstBadVersion, int n) {
    for (int i = 1; i <= n; i++) {
      when(versionControl.isBadVersion(i)).thenReturn(i >= firstBadVersion);
    }
  }
}
