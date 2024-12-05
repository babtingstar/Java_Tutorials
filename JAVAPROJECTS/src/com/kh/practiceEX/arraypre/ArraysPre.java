package com.kh.practiceEX.arraypre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray(){
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        System.out.println("TODO 1");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("TODO 2");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("TODO 3");
        Arrays.fill(arr1, 500);
        System.out.println(Arrays.toString(arr1));

        System.out.println("TODO 4");
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println(flag);
    }

    public void string1DArray(){
        String[] arr1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("TODO 1");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("TODO 2");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("TODO 3");
        Arrays.fill(arr1, "mango");
        System.out.println(Arrays.toString(arr1));

        System.out.println("TODO 4");
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println(flag);
    }

    public static void main(String[] args) {
        ArraysPre arraysPre = new ArraysPre();
        arraysPre.int1DArray();
        arraysPre.string1DArray();
    }
}
