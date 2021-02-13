import java.util.*;
public class array_average_bp{

  public static int getAverage(int[] marks){
    return (int) Arrays.stream(marks).average().orElse(Double.NaN);
  }

}