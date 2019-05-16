package JavaTasks;

/*
Task: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 10000.

 */

public class SumOfMultiples {

//        the sum of multiples of 3 or 5 below 10000
    private static int totalSumOfMultiples() {
        int totalSum = 0;

//      set to avoid magic numbers
        final int belowValue = 10000;

        for (int i = 0; i < belowValue; i++) {
//       placed in the same if to avoid duplication of numbers such as 15 & 30
            if (i % 3 == 0 || i % 5 == 0)
                totalSum = totalSum + i;
        }
        return totalSum;
    }

//      call totalSumOfMultiples and print answer to screen
    public static void main(String[] args) {
        System.out.println(SumOfMultiples.totalSumOfMultiples());

    }

}

