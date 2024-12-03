package com.kh.loopEx;

public class ForEx {
    /*

    for 문은 ; ; 존재 유무가 중요하기 때문에 ; ; 존재하면 실행

    for(초기값 ; 조건문 ; 증감식){
        조건이 true 일 때 실행할 기능
        }


    ==========작성하면 안되는 예시==========
    for( 초기값; true; 증감식){
        계속 true 이기 때문에 무한루프
        }

    for(; ; ){
        계속 true 이기 때문에 무한루프
        }

    for(int a =1; ; i++){
        계속 true 이기 때문에 무한루프
        }
    ========================================

     */

    public void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i의 값 : " + i);
        }
    }

    /*
    for 문 또한 조건이 true 일때 실행할 기능이 1개라면, {} 생략 가능

    for(초기문; 조건문; 증감문;) 조건이 true 일 때 실행할 기능;
     */
    public void method2() {
        for (int i = 0; i < 5; i++) System.out.println("i의 값 : " + i);
    }

}
