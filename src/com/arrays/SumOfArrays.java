package com.arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        float[] flot={45.6f,45.7f,89.4f,65.3f};
        float sum=0;

        for(float f:flot){
            sum=sum+f;
        }
        System.out.println(sum);
    }
}
