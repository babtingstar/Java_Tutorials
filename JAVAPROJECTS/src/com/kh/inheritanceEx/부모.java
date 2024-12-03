package com.kh.inheritanceEx;

public class 부모 {
    public String 성씨 = "강";
    private int money = 100_000_000;
    private String car = "제네시스";

    public 부모() {
        super(); // Object 를 항상 상속받기 때문에, 존재하지만 생략
    }

    // 매개변수 생성자, 파라미터 생성자
    public 부모(String 성씨, int money, String car) {
        super(); // 이미 존재하기 때ㅜㅁㄴ에 생략
        this.성씨 = 성씨;
        this.money = money;
        this.car = car;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String get성씨() {
        return 성씨;
    }

    public int getMoney() {
        return money;
    }

    public String getCar() {
        return car;
    }

    /*
    Override() 오버라이딩
    부모 메서드 위에 자식 메서드가 올라탐
    부모 기능을 자식이 다시 정의를 내려서 사용
    재정의
     */


    @Override
    public String toString() {
        return "부모{" +
                "성씨='" + 성씨 + '\'' +
                ", money=" + money +
                ", car='" + car + '\'' +
                '}';
    }
}
