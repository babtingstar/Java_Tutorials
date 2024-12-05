package com.kh.arrayEx;
/*
Arrays 클래스는 Java 에서 배열으 ㄹ다룰 때 유용한 기능을 제공

기능들
toString (배열이 들어있는 변수명) : 1차원 배열은 값 출력, 이외는 주소값 출력
deepToString (2차원 배열이 들어있는 변수명) : 2차원이상의 배열만 사용 가능
sort (오름차순으로 정렬할 변수명) : 오름차순 정렬
fill(배열 내 값을 동일하게 변경할 변수명, 숫자) : 모든 요소(값)을 동일하 값으로 채움
copyOf() 배열을 복사하고, 지정된 길이에 맞게 크기를 변경
equals() 두 배열이 동일한지 비교
deepEquals() 2차원 이상의 배열이 동일한 지 비교
 */


import java.util.Arrays;

public class ArraysEx {
    public void arr1DMethod(){
        int[] arr1 = {5, 2, 8, 3, 1};
        int[] arr2 = {5, 2, 8, 3, 1};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // arr1 모든 값을 오름차순으로 정렬하기
        Arrays.sort(arr1);
        System.out.println("오름차순으로 정렬 후 arr1 : " + Arrays.toString(arr1));

        // arr1 모든 값을 7 로 채우기
        Arrays.fill(arr1, 7);
        System.out.println("모든 값을 7로 변경 후 arr1 : " + Arrays.toString(arr1));

        // arr1 과 배열이 같은지 비교하기
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println("arr1 과 주어진 배열을 비교했을 때 값이 같은지 확인 : " + flag);
    }
    public static void main(String[] args) {
        ArraysEx arraysEx = new ArraysEx();
        // ArraysEx 객체에 작성된 기능 중 실행하고자 하는 기능명 작성
        // arraysEx.기능명칭()
        arraysEx.arr1DMethod();
    }
}
