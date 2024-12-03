package com.kh.polymorphismEx;
/*
다형성 : 다양한 형태를 지니는 성질

1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
   자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임

2. 오버 로딩
    같은 클래스에서 같은 이름의메서드를 여러 번 작성하는 기술
    조건 : 메서드명이 동일하고, 매개변수 개수-타입-순서 가 하나라도 달라야함
    목적 : 전달받은 매개 변수에 따른 상황별 처리 방법 구현
    sum(a, b)
    sum(a, b, c)
 */
public class PolymorphismEX {
    // 오버로딩문제
    /*
    public void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }
    public void sum(double a, double b){
        double result = a + b;
        System.out.println(result);
    }
    public void sum(String a, String b){
        String result = a + b;
        System.out.println(result);
    }
    */


}
