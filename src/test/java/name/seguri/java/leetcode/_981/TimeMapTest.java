package name.seguri.java.leetcode._981;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TimeMapTest {

  @Test
  void input1() {
    var timeMap = new TimeMap();
    timeMap.set("foo", "bar", 1);
    timeMap.set("foo", "bar2", 4);

    assertThat(timeMap.get("foo", 1)).isEqualTo("bar");
    assertThat(timeMap.get("foo", 3)).isEqualTo("bar");
    assertThat(timeMap.get("foo", 4)).isEqualTo("bar2");
    assertThat(timeMap.get("foo", 5)).isEqualTo("bar2");
  }
}
