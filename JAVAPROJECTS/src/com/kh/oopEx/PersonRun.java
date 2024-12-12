package com.kh.oopEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonRun {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 40);

        String path = System.getProperty("user.home") + "/바탕 화면/";

        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
            System.out.println("직렬화 완료 : " + person);
            System.out.println("파일이 바탕화면에 저장되었습니다. : " + path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 역직렬화
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis)){
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
