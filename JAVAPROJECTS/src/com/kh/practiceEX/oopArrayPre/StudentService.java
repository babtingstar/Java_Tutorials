package com.kh.practiceEX.oopArrayPre;

import java.util.ArrayList;

public class StudentService {
    public static void main(String[] args) {

        /*
        student2 와 student3

        student2 = if 문을 이용해서 프론트엔드에서 전달받은 값을 한 번 더 검증하고 DB에 값을 저장

        student3 = 프론트엔드에서 검증된 값을 저장하고 추가적으로 검증하고자 하는 값은 검증을 진행한 후 DB에 값을 저장
         */
        //배열로 학생 0 학생 1 생성하기
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student("홍길동", 10);

        // 기본생성자를 이용해서 student2 이름 나이 idCard 추가
        Student students2 = new Student();
        // 이름이 6글자 이상이면 저장되지 않게 설정
        String inputName = "김철수";
        if(inputName != null && inputName.length() < 6){
            students2.setName(inputName);
            System.out.println("이름이 성공적으로 저장되었습니다 : " + inputName);
        }
        System.out.println("이름은 6글자 이하이여야 하고, 빈 칸일 수 없습니다 : " + inputName + " - 저장불가");

        int inputAge = 18;
        if(inputAge !=0){
            students2.setAge(inputAge);
            System.out.println("나이가 성공적으로 저장되었습니다 : " + inputAge);
        } else {
            System.out.println("나이는 12세 이상, 19세 이하만 작성할 수 있씁니다. \n 어린이, 성인 입학 불가");
        }

        String inputIdCard = "버스카드기능추가";
        if(inputIdCard != null && inputIdCard.length() < 10){
            students2.setIdCard(inputIdCard);
            System.out.println("기능이 추가되었습니다 : " + inputIdCard);
        }else {
            System.out.println("10 자 이하의 기능만 추가 기입이 가능합니다.");
        }


        // 매개변수 생성자를 이용해서 학생 3번은 이름 나이를 필수로 입력받되,
        // idCard 선택적으로 set을 이용해서 추가
        Student students3 = new Student();
        System.out.println("버스카드 기능 추가(선택사항 / 금액 10,000 원)");
        String plusIdCard = "버스카드";
        if(plusIdCard != null && plusIdCard.length() < 10){
            students3.setIdCard(plusIdCard);
        }else {
            System.out.println("버스카드 기능 없이 학생증을 발급하겠습니다.");
        }

        //ArrayList 를 이용해서 학생 0 1 2 3 의 목록 관리
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(students[0]); // 객체 배열로 저장된 학생 0 추가
        studentsList.add(students[1]); // 객체 배열로 저장된 학생 1 추가
        studentsList.add(students2); // 오직 set 으로 저장된 학생 2 추가
        studentsList.add(students3); // 매개변수와 set 으로 작성된 학생 3 추가

        // for 문을 이용해서 저장된 학생 출력
        System.out.println("for 문");
        for(int i = 0; i < studentsList.size(); i++){
            System.out.println(studentsList.get(i).toString());
        }
        System.out.println("향상된 for 문");
        for (Student s : studentsList) {
            System.out.println(s.toString());
        }

    }
}
