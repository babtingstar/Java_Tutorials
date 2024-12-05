package com.kh.arrayEx;

import java.util.Arrays;

/*
배열에서 Arrays 내의 toString 이나 deepToString 을 사용하면
for 문으 ㄹ사용하지 않고도 출력할 수 있음
 */
public class ArrayToStringEx {

    public void toString1DMethod() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("numbers : " + numbers); // 배열의 위치(주소값) 출력
        System.out.println("Arrays.toString(numbers) : " + Arrays.toString(numbers));
        //System.out.println("Arrays.deepToString(numbers) : " + Arrays.deepToString(numbers));
        //deepToString 은 2차원부터 가능하기 때문에 1차원 배열에서 사용 x
    }

    public void toString2DMethod() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("numbers : " + numbers);
        System.out.println("Arrays.toString(numbers) : " + Arrays.toString(numbers));
        System.out.println("Arrays.deeptoString(numbers) : " + Arrays.deepToString(numbers));
    }


    //ArrayToStringEx에 적힌 작성한 method 기능 실행용 main 메서드
    public static void main(String[] args) {
        ArrayToStringEx arrayToStringEx = new ArrayToStringEx();
//        arrayToStringEx.toString1DMethod();
        arrayToStringEx.toString2DMethod();
    }
}
