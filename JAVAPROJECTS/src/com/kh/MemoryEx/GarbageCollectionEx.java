package com.kh.MemoryEx;
/*
Garbage : 1950 ~ 1960 프로그래밍 언어가 발전하던 시기에
          불필요한 데이터나 사용되지 않는 메모리를 의미하느 은유적인 표현
          사용되지 않는 메모리 영역을 Garbage 로 사용

          자바는 이 전통을 이어받아서 메모리 관리 시스템의 이름을 가비지 컬렉션이라고 함
 */
/*

 */
public class GarbageCollectionEx {

    public static void main(String[] args) {
        String 주소 = "https://";
        System.out.println("주소 : " + 주소);
        주소 += "www.naver.com";
        System.out.println("주소 : " + 주소);

        // String 의 경우 불변성으로 인해 적합한 예제는 아니지만
        // 가장 직괁거으로 가비지 컬렉션을 확인할 수 있어 예제 작성
    }
}
