package com.kh.practiceEX.filePre;

import java.io.*;

public class FileService {

    //File FileWriter 이용해서 바탕화면서 food.docs 생성하기
    //try-catch

    /* 파일 생성 및 작성하기 메서드
    void createFile(String content)
    @param content
     */
    public void createFile(String content){
        // 사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String FileName = "food.docs";

        File file = new File(path + FileName);

        try {
            file.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println("file creation failed");
        }
        //try() 안에 FileWriter / FileReader / BufferedReader 작성하면 close 작성 x
        try(FileWriter fw = new FileWriter(file)){
            fw.write(content);
            System.out.println("file written");
        }catch(Exception e){
            System.out.println("file writing failed");
        }

    }


    /*
     TODO : File FileReader BufferedReader 이용해서파일 읽기 기능 설정
            try - resource - catch 문으로 작성
     */

    public void readFile(){
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String FileName = "food.docs";

        File file = new File(path + FileName);
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String str;
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
        }catch(Exception e){
            System.out.println("error reading file");
        }
    }

    /*
    TODO : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정해서
            이어서 음식 작성
            \n - 햄버거 \n - 돈까스 \n - 쌀국수 \n - 카레
            File FileWriter
            FileServiceRun 에서 readFile 한 번 더 불러와 이어서 작성되었는지 확인
     */

    public void appendToFile(String content){
        // System.getProperty("user.home") = c/users/babti 까지의 경로
        String path = System.getProperty("user.home") + "/바탕 화면/";
        String FileName = "food.docs";

        File file = new File(path + FileName);
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write(content);
            System.out.println("file written");
        }catch(Exception e){
            System.out.println("file appending failed");
        }
    }
}
