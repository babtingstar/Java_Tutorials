package com.kh.testEx.test1pre;

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();

        member.setId("user1");
        member.setName("강길자");
        member.setPassword("pass1");

        System.out.println("\n===== login =====");
        System.out.println("input id : ");
        String inputId = sc.nextLine();
        System.out.println("input password : ");
        String inputPassword = sc.nextLine();

        if(member.login(inputId, inputPassword)){
            System.out.println("login success. Welcome " + member.getName() + "!");
        }else{
            System.out.println("login failed. Please try again.");
        }


    }
}
