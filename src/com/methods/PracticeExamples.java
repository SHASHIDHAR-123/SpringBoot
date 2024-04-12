package com.methods;

public class PracticeExamples {
    public static void main(String[] args) {
        int result=sumOfTwoNumbers(30,50);
        System.out.println(result);
        System.out.println(sumOfTwoNumbers(45,45));
        greet();
    }

    public static int sumOfTwoNumbers(int x,int y){
        int answer=x+y;
        return answer;
    }
    public static void greet(){
        System.out.println("welcome");
    }
}
