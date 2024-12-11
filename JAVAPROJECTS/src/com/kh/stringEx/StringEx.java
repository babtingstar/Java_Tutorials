package com.kh.stringEx;

public class StringEx {
    /*
    String 에 적혀있는 대표적인 기능들

    String str = "안녕하세요";

    str.length() : 문자열의 길이를 반환
    str.charAt(int index) : 특정 숫자 위치(0부터)의 문자를 반환
    str.indexOf(String str) : 특정 문자열의 첫 번째 위치를 반환(못 찾으면 -1)
    str.lastIndexOf(String str) : 특정 문자열의 마지막 위치를 반환
    str.contains(String str) : 문자열의 특정 값이 포함되어 있는지 boolean 으로 반환
    str.equals(String str) : 문자열이 일치하는지 boolean 으로 반환
    str.equalsIgnoreCase(String str) : 대소문자 구분없는 equals
    str.toUpperCase(String str) : 문자열을 모두 대문자로 변환
    str.toLowerCase(String str) : 문자열을 모두 소문자로 변환
    str.trim() : 문자열의 앞뒤 공백 제거
    str.subString(int beginIndex) : 특정 위치부터 끝까지 자르기
    str.subString(int beginIndex, int endIndex) : 특정 범위를 잘라내기
    str.replace(target, replacement) : 특정(target) 문자를 다른(replacement) 문자로 교체
    str.replaceAll(String regex, replacement) : 정규식을 이용한 문자 치환
    str.split(String regex) : 문자열을 정규식 기준으로 나누기
    str.concat(String str) : 문자열을 결합
    str.join(구분자, 결합1, 결합2, ...) : 구분자를 이용해 문자열 결합
    str.isEmpty() : 문자열이 비어있는 지 확인 return boolean
    str.isBlank() : 공백만 포함하거나 비어있는지 확인 return boolean
     */
    public void methodString(){
        String str1 = " Hello World! ";
        String str2 = "hello";

        // 1. str1 문자열의 길이 반환
        int num = 0;
        System.out.println(++num);
        System.out.println(str1.length());

        // 2. str2 1번 위치의 문자가 무엇인지 확인
        System.out.println(++num);
        System.out.println(str2.charAt(1));

        // 3. str2 첫 번째 'l' 문자의 위치 반환
        System.out.println(++num);
        System.out.println(str2.indexOf('l'));

        // 4. str2 마지막 'l' 문자의 위치 반환
        System.out.println(++num);
        System.out.println(str2.lastIndexOf('l'));

        // 5. str1 World 라는 값이 포함되어 있는지 확인
        System.out.println(++num);
        System.out.println(str1.contains("World"));

        // 6. 대소문자를 구분하여 str1 과 str2 문자열 비교
        System.out.println(++num);
        System.out.println(str1.equals(str2));

        // 7. 대소문자를 구분하지 않고 str1 과 hello world 문자열 비교
        System.out.println(++num);
        System.out.println(str1.equalsIgnoreCase("hello world"));

        // 7-1. 대소문자를 구분하지 않고 공백을 제거한 후 str1 과 hello world 문자열 비교
        System.out.println(num);
        System.out.println(str1.trim().equalsIgnoreCase("hello world"));

        // 8. str1 문자열을 모두 대문자로 변환
        System.out.println(++num);
        System.out.println(str1.toUpperCase());

        // 9. str2 문자열을 모두 소문자로 변환
        System.out.println(++num);
        System.out.println(str2.toLowerCase());

        // 10. str1 앞 뒤 공백 제거
        System.out.println(++num);
        System.out.println(str1.trim());



        String str3 = "Hello Java World";
        String str4 = "Let's learn!";


        // 11. subString 이용해서 str3의 6번째 부터 끝가지 자르기
        System.out.println(++num);
        System.out.println(str3.substring(6));

        // 12. subString str3 3 ~ 7 자르기
        System.out.println(++num);
        System.out.println(str3.substring(3, 7));

        // 13. replace 이용해서 Java 를 HTML 로 대체
        System.out.println(++num);
        System.out.println(str3.replace("Java", "HTML"));

        // 14. concat str4 를 str3 와 결합
        System.out.println(++num);
        System.out.println(str3.concat(str4));
        System.out.println(str3+str4);

        // 15. split 으로 " "(공백) 기준으로 나누고 for-each 문을 이용해서 출력
        System.out.println(++num);
        String[] str3split = str3.split(" ");
        for(String s : str3split)
        {
            System.out.println(s);
            System.out.println(" ");
        }
    }

    public void method1(){
        String str = "안녕하세요. 반갑습니다.";
        System.out.println();
        str = "식사는 맛있게 하셨나요?";
        System.out.println(str.toString());
    }

    public void method2(){
        String str = "Hello";
        str += "World";
        System.out.println(str);
        System.out.println(str.hashCode());
    }
}
