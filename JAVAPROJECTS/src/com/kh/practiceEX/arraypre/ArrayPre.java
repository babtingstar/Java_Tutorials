package com.kh.practiceEX.arraypre;

/*
    Tip
    1차원 배열
    int[] arr = {    };
    int []arr = new int[n];
    int arr[];

    2차원배열
    int[][] arr = { {    ], {    }, {    } };
    int [][]arr = new int[n][];
    int arr[][];

    [], [][] 배열 객체를 만들어유저들에게 기능을 제공 => Arrays 파이로
    Arrays.toString)출력하고자 하는 변수명);
    1차원 출력할 때 적합
    1차원 배열의 요소들을 문자열로 변환하여 출력
    2차원 이상의 배열 요소들은 값을 제대로갈등의 주소값을 출력

    Arrays.deepToString(출력하고자 하는 변수명);
    2차원 이상의 배열 출력할 때 적합
    2차원 이상의 모든 배열의 값을 출력해서 사람이 읽을 수 있느 ㄴ형태로 사용

     */

import java.util.Arrays;

public class ArrayPre {

    /*
    Tip
    1차원 배열
    int[] arr = {    };
    int []arr = new int[n];
    int arr[];

    2차원배열
    int[][] arr = { {    ], {    }, {    } };
    int [][]arr = new int[n][];
    int arr[][];

     */

    // 1. 주어진 정수 배열에서 가장큰 숫자를 찾아서 출력하기
    public void maxValue() {

        // 정수가 들어있는 배열
        int[] numbers = {12, 45, 3, 22, 78, 10};

        // 배열에서 최댓값을 찾아 출력
        int max = numbers[0]; // 찾은 최대값을 가져올 변수명 설정, integer 이기 때문에 0으로 초기화
        for (int i = 1; i < numbers.length; i++)
            /* for(int i=1) 로 시작하는 이유 : for[0]에 최댓값을 저장하기 때문
               첫 번째 자리값과 두 번째 자리값을 비교해서 max 에 저장
             */ {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        } // for 문이 종료된 다음에 결과를 출력

        System.out.println("최대값 : " + max);
    }

    // 2. 문자열 배열에서 특정 문자열 찾기 / cherry 라는 단어가 어디에 위치했는지 찾아보기
    public void findString() {
        String[] words = {"apple", "banana", "cherry", "date", "melon"};
        String target = "cherry";

        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                System.out.println(i + "번 째 단어가 " + target + "입니다.");
                break;
            }
        }
    }

    // 3. 배열에서 특정 숫자 교체하기
    public void replaceArrayNumber() {
        int[] numbers = {10, 20, 30, 20, 40, 20, 320};
        int target = 20; // 바꿀 숫자
        int replaceNumber = 99; // 20 대신 넣을 숫자


        System.out.println("시작 : " + Arrays.toString(numbers));
        // for 문으로 배열을 순회해서 만약에 교체할 숫자랑 배열에 들어있는 숫자가 일치하면 교체
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                numbers[i] = replaceNumber;
                System.out.println(Arrays.toString(numbers));
            }
        }

    }

    // 4. 배열에서 특정 문자열 교체하기
    public void replaceArrayString() {
        String[] words = {"apple", "banana", "cherry", "banana", "date"};
        String target = "banana";
        String replacement = "mango";

        System.out.println("시작 : " + Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                words[i] = replacement;
                System.out.println(Arrays.toString(words));
            }
        }
    }

    // 5. 이중 배열 출력하기
    public void print2DArray(){
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
        }
    }

    // 6. 이중 배열에서 특정 숫자값의 위치 찾기
    public void find2DArray(){
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 50;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(target == numbers[i][j]){
                    System.out.println("숫자 target 은 ["+i+"]["+j+"] 위치에 존재합니다");
                }
            }
        }
    }

    public void findString2DArray(){
        String[][] words = {
                {"cat", "dog", "fish"},
                {"parrot", "hamster", "rabbit"},
                {"turtle", "snake", "lizard"}
        };

        String target = "rabbit";

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length; j++){
                if(target.equals(words[i][j])){
                    System.out.println(target + "은 배열 ["+i+"]["+j+"]에 위치함");
                }
            }
        }
    }

    public void replaceString2DArray(){
        String[][] words = {
                {"red", "blue", "green"},
                {"yellow", "blue", "purple"},
                {"pink", "blue", "orange"}
        };
        String target = "blue";
        String replacement = "cyan";

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length; j++){
                if(target.equals(words[i][j])){
                    words[i][j] = replacement;
                }
                System.out.print(words[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public void lunchMenuArray(){
        String[] lunchMenu = {"김치찌개", "된장찌개", "삼겹살", "초밥", "치킨", "햄버거"};
        System.out.println(Arrays.toString(lunchMenu));
    }

    public void lunchMenu2DArray(){
        String[][] lunchMenu = {
                {"김치찌개", "된장찌개", "불고기"},
                {"햄버거", "피자", "파스타"},
                {"짜장면", "짬뽕", "탕수육"},
                {"초밥", "라멘", "돈카츠"}
        };
        System.out.println(Arrays.deepToString(lunchMenu));
    }
    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre();
//        arrayPre.maxValue();
//        arrayPre.findString();
//        arrayPre.replaceArrayNumber();
//        arrayPre.replaceArrayString();
//        arrayPre.print2DArray();
//        arrayPre.find2DArray();
//        arrayPre.findString2DArray();
//        arrayPre.replaceString2DArray();
        arrayPre.lunchMenuArray();
    }
}
