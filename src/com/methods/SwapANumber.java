package com.methods;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class SwapANumber {
    public static void main(String[] args) {
        //Swap(10,20);

        List<String> list= Arrays.asList("acd","abc","def","acd","abc");

        Set<String> unique=list.stream().collect(Collectors.toSet());

        System.out.println(unique);
    }

//    public static void Swap(int a,int b){
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+" "+b);
//    }
}
