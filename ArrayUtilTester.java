package Labs.Lab06;
import java.util.Arrays; 

public class ArrayUtilTester{
public static void main(String[] args)

//reverse 
{ String[] arr = {"a","b","c","d","e"};

ArrayUtil.reverse(arr); 
System.out.println(Arrays.toString(arr));

 // Resize test
 String[] resizedArr = ArrayUtil.resize(arr);
 System.out.println(Arrays.toString(resizedArr));

 // Add test
 String[] addedArr = ArrayUtil.add("f", arr);
 System.out.println( Arrays.toString(addedArr));

 // Contains test
 boolean containsC = ArrayUtil.contains("c", arr);
 System.out.println(containsC);

 boolean containsG = ArrayUtil.contains("g", arr);
 System.out.println(containsG);

 // Integer array tests
 int[] intArr = {5, 2, 8, 1, 9};

 // Min value test
 int minValue = ArrayUtil.findMinValue(intArr);
 System.out.println(minValue);

 // Max value test
 int maxValue = ArrayUtil.findMaxValue(intArr);
 System.out.println(maxValue);

 // Min index test
 int minIndex = ArrayUtil.findMinIndex(intArr);
 System.out.println(minIndex);

 // Max index test
 int maxIndex = ArrayUtil.findMaxIndex(intArr);
 System.out.println(maxIndex);

}
    
}