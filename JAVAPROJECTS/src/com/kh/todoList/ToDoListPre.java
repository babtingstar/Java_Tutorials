package com.kh.todoList;

import java.io.File;
import java.io.IOException;

public class ToDoListPre {
    public void loadFile(String fileName)
    {
        File file = new File(fileName);
        if(file.exists()){

        }else {
            System.out.println("File not found");
            return;
        }
    }
    public void newFile(String fileName) {
        File file = new File(fileName);
        if(file.exists()){
            System.out.println("File already exists");
            return;
        }
        else {
            try {
                file.createNewFile();
                System.out.println("New file created");
            } catch (IOException e) {
                System.out.println("Error creating new file : " + e.getMessage());
            }
        }
    }

    public void readTxt(){}
    public void addTxt(){}
}
