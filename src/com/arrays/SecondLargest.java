package com.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array={5,4,7,8,9,7,6};
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(array[1]);
    }
}
