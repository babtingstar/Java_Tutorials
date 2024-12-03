package com.kh.oopEx;

public class OopRun {

    //만약에 Nation 에 접근제한자나 static을 붙이길 원한다면
    //main() 메서드 밖에 작성해야 함

    public Nation n1 = new Nation();
    public static Nation N_Two = new Nation();

    public static void main(String[] args) {
        // {} 안에 있기 때문에 지역변수로 접근제한자를 앞에 붙이지 못핳ㅁ
        // static main() 메서드 안에 있기 때문에 static 사용 불가
        // 접근제한자 사용 불가!
        Nation n2 = new Nation();
        Student s = new Student();

    }
}
