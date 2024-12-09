package com.kh.practiceEX.arraypre.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser() {
        Scanner sc = new Scanner(System.in);

        User u = new User();

        // setter 를 이용해서 유저 저장
        // username 빈칸이거나 6글자 이상은 저장x return 시키기
        // email 빈칸이거나 30자 이상 작성 불가 return 시키기
        User u2 = new User();
        System.out.println("Enter the name of the user: ");
        String inputUserName = sc.nextLine();
        if(inputUserName!=null && inputUserName.length() < 6){
            u2.setUsername(inputUserName);
            System.out.println("Username saved");
        }else {
            System.out.println("Username is null or too long");
            return;
        }
        System.out.println("Enter the email of the user: ");
        String inputEmail = sc.nextLine();
        if(inputEmail!=null && inputEmail.length() < 30){
            u2.setEmail(inputEmail);
        }else {
            System.out.println("email is null or too long");
            return;
        }

        u.setUsername("홍길동"); // String s = u.setUsername() 불가능
        String s = u.getUsername(); // set 으로 저장된 값은 변수명에 직접 넣는게 아니라 get 으로 반환받아 저장
        u.setAge(10);
        u.setEmail("hong@hong.com");

        System.out.println("---------- 저장된 사용자 정보 ---------");
        // ArrayList 이용해서 정보 저장
        // toString 이용해서 저장된 사용자 정보 가져오기

        ArrayList<User> users = new ArrayList<>();
        users.add(0, u);
        users.add(1, u2);
        System.out.println(users.toString());
    }
}
