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
        if (inputUserName != null && inputUserName.length() < 6) {
            u2.setUsername(inputUserName);
            System.out.println("Username saved");
        } else {
            System.out.println("Username is null or too long");
            return;
        }
        System.out.println("Enter the email of the user: ");
        String inputEmail = sc.nextLine();
        if (inputEmail != null && inputEmail.length() < 30) {
            u2.setEmail(inputEmail);
        } else {
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
    // 메서드 명칭 : void 기능 paramNameEmail
    // Scanner 사용
    //매개변수 생성자를 통해서 저장 나이는 필수가 아님
    //매개변수 생성자 -> 이름 / 이메일만 필수로 받도록 수정

    //이메일을 입력하시겠습니까? yes/no 대소문자 구분없이 입력받기

    //yes 했다면 setEmail 을 통해 입력받은 이메일값 저장

    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the user : ");
        String inputUserName = sc.nextLine();
        if (inputUserName == null) {
            System.out.println("name cannot be blank");
            return;
        }

        System.out.println("Enter the email of the user : ");
            String inputEmail = sc.nextLine();
            if (inputEmail == null) {
                System.out.println("email cannot be blank");
                return;
            }

        User u = new User(inputUserName, inputEmail);

        System.out.println("Gonna input Age? (yes/no) : ");
        String inputAgeYN = sc.nextLine();
        int inputAge = 0;
        switch (inputAgeYN.toLowerCase()) {
            case "yes":
                System.out.println("Enter the Age of the user : ");
                try {
                    inputAge = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Age is not valid");
                }
                break;
            case "no":
                System.out.println("Age input aborted");
                break;
            default:
                System.out.println("input YES or NO");
                break;
        }

        u.setAge(inputAge);

        System.out.println("---ToString---");
        System.out.println(u.toString());

    }
}
