package com.kh.practiceEX.filePre;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        //파일에 작성할 내용
        //맛있는 음식 목록 : \n 피자 \n 치킨 \n 초밥 \n 파스타
        //createFile 기능 호출, 자료형 없는 매개변수 명으로 파일 작성 내용 넣어주기

        String inputText = "맛있는 음식 목록 : \n - 피자 \n - 치킨 \n - 초밥 \n - 파스타\n";
        System.out.println("=== createFile ===");
        fileService.createFile(inputText);

        System.out.println("=== readFile after createFile ===");
        fileService.readFile();

        System.out.println("=== appendToFile ===");
        fileService.appendToFile(inputText);

        System.out.println("=== readFile after appendToFile===");
        fileService.readFile();

        String content;
    }
}
