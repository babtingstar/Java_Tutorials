package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionExRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ConditionEx cix = new ConditionEx();
//
//        System.out.print("Enter age : ");
//        int age = sc.nextInt();
//        sc.nextLine();

//        cix.method0(age);
//        cix.method1(age);
//        cix.method2(age);
//        cix.method3(age);
//        cix.method4(age);

//        ConditionPre cip = new ConditionPre();
//
//        System.out.println("Enter month");
//        int month = sc.nextInt();
//        sc.nextLine();
//        cip.method1(month);

        ConditionSwitchPre csp = new ConditionSwitchPre();
        System.out.print("Enter digit : ");
        int choice = sc.nextInt();
        sc.nextLine();
        csp.choiceDay(choice);
    }

}
