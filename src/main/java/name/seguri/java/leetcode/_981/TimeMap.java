package name.seguri.java.leetcode._981;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

class TimeMap {

  private final Map<String, TreeMap<Integer, String>> store = new HashMap<>();

  public TimeMap() {}

  public void set(String key, String value, int timestamp) {
    store.putIfAbsent(key, new TreeMap<>());
    store.get(key).put(timestamp, value);
  }

  public String get(String key, int timestamp) {
    return Optional.ofNullable(store.get(key))
        .map(t -> t.floorEntry(timestamp))
        .map(Entry::getValue)
        .orElse("");
  }
}
