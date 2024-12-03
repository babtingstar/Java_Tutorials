package com.kh.variableEx;


//Constant : 상수 / 변함x
public class Constant {
    // 상수의 경우 어디서든 사용할 수 있도록 static 을 앞에 붙여줌
    // static 이 붙은 상수나 변수는 어디서든 접근 가능하기 때문에 글로벌 상수/ 글로벌 변수 라고도 함
    public static final int NUMBER = 100;

    public static void main(String[] args) {
        /*
        지역변수 : 이미 선언된 메서드의 내부 범위로 접근이 제한되기 때문에
                   접근 제한자를 추가로
                   main() 뿐만 아니라 public void method1(){} public _ method1() 에서도 사용 불가
         */

        // 상수 : 한 번 값을 기록하면 값을 바꿀 수 없음

        // 상수 키워드 : final

        // 상수명 작성 : 대문자 작성, 연결되는 단어 사이는 "_" 구분
        Variable variable = new Variable(); // 접근제한자 사용 불가
        final double PI = 3.14;
        final int MIN = 0;
        final int MAX = 100;


    }



}
