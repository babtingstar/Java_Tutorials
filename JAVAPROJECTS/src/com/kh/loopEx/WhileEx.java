package com.kh.loopEx;

import java.util.Scanner;

public class WhileEx {

    /*
    while(조건이 true 일 때 실행){
    }

    while 을 멈추는 방법 1 : 특정 조건에서 return;

    while 을 멈추는 방법 2 : 변수명에 논리값을 담고, 멈추고자 하는 조건에서 논리값을 false로 변경

    boolean is = true;
    while(is){
        is = false;
        }

    while 을 멈추는 방법 3 : 조건을 false 로 변경
    while(조건){
        조건이 false 가 될 때까지 수행
        }
     */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //int input = 0;

        int input = 0;
        while(input != -1){
            System.out.println("---반복 시작---");
            System.out.println("Enter number: ");
            input = sc.nextInt();
            sc.nextLine();
            if(input != -1) sum += input;
        }
        System.out.println("합계 : " +sum);
    }

    /*
    do-while()
    : 조건식이 뒤에 작성된 while 문, true 가 아니더라도 최초 1회 이상의 반복을 보장

    do{
        최초 1회는 무조건 수행, 이후에는 while(true)여야 수행
        }
        while(조건)
     */
}
