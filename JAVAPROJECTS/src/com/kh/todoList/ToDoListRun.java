package com.kh.todoList;

import java.util.Scanner;

public class ToDoListRun {
    private static String PATH = System.getProperty("user.home") + "/바탕 화면/";
    private static String FILE_NAME = "todolist";
    private static String EXT_NAME = ".txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListPre todo = new ToDoListPre();

        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();


        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                todo.loadFile(FILE_NAME);
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                todo.newFile(FILE_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


//            switch (choice) {
//                case 1:
//                    System.out.print("확인할 To-Do 리스트 파일 이름을 입력하세요(확장자 제외) : ");
//                    String inputString1 = scanner.nextLine();
//                    todo.readTxt(inputString1);
//                    break;
//                case 2:
//                    System.out.print("새로운 할 일을 입력하세요 : ");
//                    String inputString2 = scanner.nextLine();
//                    todo.addTxt(inputString2);
//                    break;
//                case 3:
//                    isTrue = false;
//                    System.out.println("프로그램을 종료합니다.");
//                    break;
//                default:
//                    System.out.println("다시 입력해 주세요.");
//                    break;
//            }


        }
    }
}
