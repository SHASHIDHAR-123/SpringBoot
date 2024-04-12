package com.arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={2,34,56,78,99,87,5,786};
        int maximum=arr[0];
             for(int i=1;i<arr.length;i++){
                 if(maximum<arr[i]){
                     maximum=arr[i];
                 }

        }
        System.out.println(maximum);
    }
}
