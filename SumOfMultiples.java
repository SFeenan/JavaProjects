package JavaTasks;

/*
Task: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 10000.

 */

public class SumOfMultiples {

    public static void main(String[] args) {
        SumOfMultiples sm = new SumOfMultiples();
        System.out.println(sm.totalSumOfMultiples(10000));
    }

    //      set to avoid magic numbers, named below value as we only want numbers below 100000
    int totalSumOfMultiples(int belowValue) {
        int totalSum = 0;

        for (int i = 0; i < belowValue; i++) {
//       placed in the same if to avoid duplication of numbers such as 15 & 30
            if (this.isDivisible(i, 3) || this.isDivisible(i, 5)) {
                totalSum = totalSum + i;
            }
        }
        return totalSum;
    }

    boolean isDivisible(int belowValue, int divisor) {
        if (belowValue % divisor == 0) {
            return true;
        }
        return false;
    }
}
