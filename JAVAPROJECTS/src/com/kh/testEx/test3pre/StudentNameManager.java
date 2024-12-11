package com.kh.testEx.test3pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentNameManager {

    public static void main(String[] args) {
        Set<String> studentset = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n\n학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                choice = -1;
            }
            sc.nextLine();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n추가할 학생 이름을 입력하세요 : ");
                    String inputAddName = sc.nextLine();
                    if(!studentset.contains(inputAddName)) {
                        studentset.add(inputAddName);
                        System.out.println("학생이 추가되었습니다.");
                    }else {
                        System.out.println("이미 있는 학생입니다.");
                    }
                    break;
                case 2:
                    System.out.println("\n삭제할 학생 이름을 입력하세요 : ");
                    String inputDeleteName = sc.nextLine();
                    if(studentset.contains(inputDeleteName)) {
                        studentset.remove(inputDeleteName);
                        System.out.println("학생이 삭제되었습니다.");
                    }else {
                        System.out.println("없는 학생입니다.");
                    }
                    break;
                case 3:
                    System.out.println("\n학생 목록 출력입니다.");
                    System.out.println(studentset.toString());
                    break;
                case 4:
                    System.out.println("\n존재 여부를 확인할 학생을 입력하세요 : ");
                    String inputBoolName = sc.nextLine();
                    System.out.println(inputBoolName + "은/는 " + (studentset.contains(inputBoolName) ? "존재합니다." : "존재하지 않습니다.") );
                    break;
                case 5:
                    exit = true;
                    System.out.println("\n종료합니다.");
                    break;
                default:
                    System.out.println("\n잘못 입력했습니다.");
                    break;
            }
        }
    }


}
