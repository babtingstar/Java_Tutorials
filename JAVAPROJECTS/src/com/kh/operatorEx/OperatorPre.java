package com.kh.operatorEx;

public class OperatorPre {

    public static void main(String[] args) {
        System.out.println("--- 전위 연산자 ---");

        int a = 5;
        System.out.println("a의 값 : " + a);
        int result1 = ++a;
        // 전위 연산자 : 연산이 먼저 실행
        // ++a (a => 6) 이후 result1 = a;
        System.out.println("a의 값 : " + a);
        System.out.println("result1 의 값 : " + result1);

        System.out.println("--- 후위 연산자 ---");

        int b = 5;
        System.out.println("b의 값 : " + b);
        int result2 = b++;
        // 후위 연산자 : 연산이 나중에 실행
        // result2 = b 이후 b++(b => 6)
        System.out.println("b의 값 : " + b);
        System.out.println("result2 의 값 : " + result2);


    }
}
