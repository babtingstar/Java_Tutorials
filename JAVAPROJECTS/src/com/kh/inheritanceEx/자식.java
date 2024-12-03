package com.kh.inheritanceEx;
// 자식 클래스가 부모 클래스를 상속받아 사용
// 상속 키워드는 extends
public class 자식 extends 부모{
    // 필드
    private String computer;

    public 자식(String computer) {
        /*
        super() : super 생성자, 부모 생성자
        자식 객체 생성시 부모 생성자를 호출하는 생서아
        super() 생성자를 작성할 경우 항상 자식 생성자 안에서 맨 첫 번째 줄에 작성
         */
        super();
    }

    public 자식(String 성씨, int money, String car, String computer) {
        super(성씨, money, car); // 부모의 성씨, 돈, 차 먼저 가져옴
        this.computer = computer; // 자식의 필드 작성
    }

    @Override
    public String toString() {
        return super.toString() + "자식은" + "computer=" + computer;
        //super.toString() 은 부모 클래스에 작성된 toString 불러와서 사용
    }
}
