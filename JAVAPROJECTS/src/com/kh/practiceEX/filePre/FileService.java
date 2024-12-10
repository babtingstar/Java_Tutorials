package com.kh.practiceEX.filePre;

import java.io.File;
import java.io.FileWriter;

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

        //try() 안에 FileWriter / FileReader / BufferedReader 작성하면 close 작성 x
        try(FileWriter fw = new FileWriter(file)){
            fw.write(content);
            System.out.println("file created and written");
        }catch(Exception e){
            System.out.println("error creating or writing file");
        }

    }
}
