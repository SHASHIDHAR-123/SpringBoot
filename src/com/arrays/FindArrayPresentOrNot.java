package com.arrays;

public class FindArrayPresentOrNot {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 6, 7};
        int target = 7;
        boolean found = false; // Variable to track if the element is found

        for (int i : arr) {
            if (i == target) {
                found = true; // Update found to true if element is found
                break; // Exit the loop since we found the element
            }
        }

        if (found) {
            System.out.println("Element " + target + " is present");
        } else {
            System.out.println("Element " + target + " is not present");
        }
    }
}

