package com.methods;

public class PassByValue {
    public static void main(String[] args) {
       String str="shashi";

       changeName(str);
        System.out.println(str);
    }

     static void changeName(String nam) {
        nam="shashidhar";
         System.out.println(nam);
    }
}
