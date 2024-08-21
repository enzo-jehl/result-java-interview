package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n)
  {
    if (i < 0 || n < 0)
    {
      return Option.none();
    } else if (n == 0) {
      return Option.some(1);
    } else if (i == 0) {
      return Option.some(0);
    } else
    {
      try
      {
        Integer loop = 1;
        Integer result = i;
        while (loop < n)
        {
          int previousResult = result;
          result = result * i;
          loop++;

          if (result / i != previousResult) {
            return Option.none();
          }
        }
        return Option.of(result);
      }
      catch (Exception e)
      {
        return Option.none();
      }
    }
  }
}
