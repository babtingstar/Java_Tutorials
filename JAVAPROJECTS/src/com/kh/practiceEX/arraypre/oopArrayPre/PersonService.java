package com.kh.practiceEX.arraypre.oopArrayPre;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PersonService {

    public static void main(String[] args) {

        Person[] people = new Person[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < people.length; i++){
            System.out.print(i+1 + "번 째 사람의 이름을 입력하세요 : \n");
            String name = sc.nextLine();
            System.out.print(i+1 + "번 째 사람의 나이를 입력하세요 : \n");
            int age = sc.nextInt();
            sc.nextLine();
            people[i] = new Person(name, age);
            System.out.println(i+1 + "번 째 사람의 정보가 입력되었습니다.");
        }
        System.out.println("모든 사람이 등록되었습니다.");
//        people[0] = new Person("홍길동", 20);
//        people[1] = new Person("박길자", 30);
//        people[2] = new Person("오성순", 40);
//        people[3] = new Person("강하석", 50);

        for(int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }

//        for (Person p : people) {
//            System.out.println(p);
//        }




    }
}
