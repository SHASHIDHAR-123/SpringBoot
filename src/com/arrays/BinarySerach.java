package com.arrays;

public class BinarySerach {
    public static void main(String[] args) {
        int[] array={5,4,6,7,5,4,3,78,99,67,2};
         int target=999;
       int result= binary(array,target);
        System.out.println(result);

    }

    public static int binary(int[] array,int target) {
        int start = 0;
        int end = array.length-1;
        while (start <= end) {
            int middle = (start+end)/2;

            if(target < array[middle]) {
                end = middle - 1;
            } else if(target > array[middle]) {
                start = middle + 1;

            } else {
                return middle;
            }

        }

        return -1;
    }
}
