package com.kh.variableEx;

public class Variable {

    // 변수

    // 자료형

    /*
        boolean (1 byte) - true false
        byte (1 byte) - 숫자 뒤에 b
        short (2 byte) - 숫자 뒤에 sh
        int (4 byte) - 기본 사용
        long (8 byte) - 숫자 뒤에 l

        float (4 byte) - 숫자 뒤에 f
        double (8 byte) - 기본 사용

        char (2 byte) - 문자 하나, 문자 양 옆에 ' '
     */

    /*
    참조 자료형

        String - 작성하는 값이 곧 크기이기 때문에, 크기를 가늠할 수 없음
               - " " 사용해서 내용 작성
     */

    // 변수 선언 : 메모리에 공간 생성
    // 컴퓨터 메모리에 boolean 저장공간 1byte 를 생성하고, 내용물은 없지만 해당 공간을 isTrue 라고 부름
    boolean isTrue;

    // 값 대입 : 변수에 값을 집어넣는 것(덮어쓰기)
    //isTrue = true; 이거 왜안됨?

    // 변수선언 + 값 대입
    int num1 = 100;


}
