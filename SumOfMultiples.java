package JavaTasks;

import java.util.ArrayList;

public class SumOfMultiples {

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        int threeTotal = 0;
        int fiveTotal = 0;

        int finalSum;

        for(int z = 0; z < 10000; z++){
            if(z % 3 == 0) {
                x.add(z);
                threeTotal += z;
            } else if(z % 5 == 0){
                y.add(z);
                fiveTotal += z;
            }
        }
        finalSum = threeTotal + fiveTotal;

        System.out.println("The sum of all the multiples of 3 or 5 below 10,000 is: " + finalSum);
    }
}
