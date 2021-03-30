package homework1;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //1. Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
        //2. You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)
        //3. You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)
        //4. You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}

        Integer[] arrayOfIntegers = new Integer[] {2,3,1,7,11};
        Arrays.sort(arrayOfIntegers, Collections.reverseOrder());
        System.out.println("Answer 1: " + Arrays.toString(arrayOfIntegers));

        Integer[] arrayOfPositiveNumbers = new Integer[]{-1,2,-3,4,-5,6};
        int sum = 0;
        for (Integer i :arrayOfPositiveNumbers){
            if (i > 0) {sum = sum + i;}
        }
        System.out.println("Answer 2: " + sum);

        Double[] arrayOfAverage = new Double[]{1.0,2.0,4.0,1.0};
        Double average = 0.0;
        for (Double i: arrayOfAverage){
            average = average + i;
        }
        average = average / arrayOfAverage.length;
        System.out.println("Answer 3: " + average);

        Integer[] arrayOfDuplicates = new Integer[]{3,2,3,1,4,2,8,3};
        for (int i = 0; i < arrayOfDuplicates.length; i++) {
            for (int j = i + 1; j < arrayOfDuplicates.length; j++) {
                if (arrayOfDuplicates[i].equals(arrayOfDuplicates[j])){
                    arrayOfDuplicates[j] = 0;
                }
            }
        }
        System.out.println("Answer 4: "+ Arrays.toString(arrayOfDuplicates));
    }
}
