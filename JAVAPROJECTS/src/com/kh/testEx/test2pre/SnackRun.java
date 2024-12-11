package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRun {
    public static void main(String[] args) {
        ArrayList<Snack> snacks = new ArrayList<>();
        Snack snack1 = new Snack("포테이토칩", "짠맛", 1500);
        Snack snack2 = new Snack("초코파이", "단맛", 2000);
        Snack snack3 = new Snack("허니버터칩", "허니버터맛", 2500);

        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);

        System.out.println("\n\n===== snacks =====");
        for(Snack snack : snacks){
            System.out.println(snack);
        }
    }

}
