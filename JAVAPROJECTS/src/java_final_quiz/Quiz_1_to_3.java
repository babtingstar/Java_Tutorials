package java_final_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_1_to_3 {
    public void quiz1() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

    }

    public void quiz2() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");

        char conditionChar= 'A';

        /*
        boolean = startsWith(String prefix)
                = endsWith(String suffix)
         */
        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).charAt(0) == conditionChar) {
                System.out.println(names.get(i));
            }
        }

    }

    public void quiz3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter digit 2 : ");
        int b = sc.nextInt();
        try {
            System.out.print(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero");
        }
    }

    public void quiz4() {

    }
}

