package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> result = new ArrayList<>();
    for (int i = 0; i < input.size(); i++) {
      result.add(Math.pow(((input.get(i) * 2) + 3), 5));
    }
    return result;
  }

  public static String capitalizeFirstLetter(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }


  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> result = new ArrayList<>();
    input.iterator().forEachRemaining(e -> result.add(capitalizeFirstLetter(e) + capitalizeFirstLetter(e)));
    return result;
  }
}
