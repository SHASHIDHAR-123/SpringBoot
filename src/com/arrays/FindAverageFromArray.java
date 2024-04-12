package com.arrays;

public class FindAverageFromArray {
    public static void main(String[] args) {
        int[] average = {95, 80, 65, 45, 78, 95, 40, 50,65,78};

        double findAv = 0;
        int sum = 0;
        int count=average.length;
        for (int avg : average) {
            sum = sum + avg;
        }

            findAv = sum / count;
            System.out.println(findAv);

    }
}
