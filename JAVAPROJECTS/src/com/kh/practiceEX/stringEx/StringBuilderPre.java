package com.kh.practiceEX.stringEx;

public class StringBuilderPre {
    /*
    TODO
     1. String str = "Welcome"; 으로 작성된 객체를 StringBuilder sb로 변환해서 사용하려고 함
     2. to Java 이어서 작성
     3. 8번째 자리에 the world of 추가
     4. 4 ~ 11 come to 로 변경
     5. 20 ~ 25 삭제
     6. sb 뒤집기
     */

    public static void main(String[] args) {
        String str = "welcome";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("String str hashcode : " + str.hashCode());
        System.out.println("StringBuilder str hashcode : " + sb.hashCode());

        int count = 0;

        System.out.println("Starts with : ");
        System.out.println(sb);

        sb.append("to Java");
        System.out.println("\nQuiz" + ++count);
        System.out.println(sb);

        sb.insert(8, "the world of");
        System.out.println("\nQuiz" + ++count);
        System.out.println(sb);

        sb.replace(4, 11, "come to");
        System.out.println("\nQuiz" + ++count);
        System.out.println(sb);

        sb.delete(20, 25);
        System.out.println("\nQuiz" + ++count);
        System.out.println(sb);

        sb.reverse();
        System.out.println("\nQuiz" + ++count);
        System.out.println(sb);
    }
}
