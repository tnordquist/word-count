package dev.tnordquist;

import java.util.HashMap;
import java.util.Map;

/**
 * CodingBat: given an array of strings, return a Map<String, Integer> with a key for each different
 * string, with the value the number of times that string appears in the array.
 */

public class WordCount {

  public Map<String, Integer> wordCount(String[] strings) {

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < strings.length; ++i) {

      if (!(map.containsKey(strings[i]))) {
        map.put(strings[i], 1);
      } else {
        map.merge(strings[i], 1, Integer::sum);
      }

    }
    return map;
  }

}
