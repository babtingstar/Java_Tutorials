package com.kh.conditionEx;

public class ConditionEx {
    /*
    if 조건이 맞는 구문이 1가지일 경우 {} 생략 가능

    if (condition) function

    if (condition1) function1
    else if (condition2) function2
    else function 3
     */
    public void method0(int age){
        System.out.println("if 문 {}를 생략해서 사용한 경우");
        if(age >= 19) System.out.println("성인입니다.");
        System.out.println("if, else_if, else 문 {}를 생략해서 사용한 경우");
        if(age >= 19) System.out.println("성인입니다.");
        else if (age >= 14) System.out.println("청소년입니다.");
        else System.out.println("어린이입니다.");
        System.out.println("if, else_if, else 문 {}를 생략하고 result 로 전달하기");
        String result;
        if(age >= 19) result = "성인";
        else if (age >= 14) result = "청소년";
        else result = "어린이";
        System.out.println(result);
        }

    /*
    if(조건){
    조건이 true 일 때 실행
    }
     */
    public void method1(int age){ // 매개변수명(age)에 전달인자로 나이가 들어왔을 경우
        if(age >= 19){
            System.out.println("성인입니다.");
        }
    }
    /*
    if(조건){
        조건이 true 일 때 실행
        } else{
        조건이 false 일 때 실행
        }
     */
    public void method2(int age){ // 매개변수명(age)에 전달인자값(나이값)이 들어오면
        if(age >= 19){
            System.out.println("성인입니다.");
        }else {
            System.out.println("성인이 아닙니다.");
        }
    }
    /*
    if(조건1){
        조건1 이 true 일 때 실행
        } else if(조건2){
        조건 1이 false 일 때 실행
        조건 2가 true 일 때 실행
        }
        }
     */
    public void method3(int age){
        if(age >= 19){
            System.out.println("성인입니다.");
        }else if(age <= 18 && age >= 14){
            System.out.println("청소년입니다.");
        }
    }
    /*
    if(조건1){
        조건1 이 true 일 때 실행
        } else if(조건2){
        조건 1이 false 일 때 실행
        조건 2가 true 일 때 실행
        } else {
        조건 1, 조건 2 모두 false 일 때 실행
        }
     */
    public void method4(int age){
        if(age >= 19){
            System.out.println("성인입니다.");
        }else if(age <= 18 && age >= 14){
            System.out.println("청소년입니다.");
        }else {
            System.out.println("어린이입니다.");
        }
    }

}

