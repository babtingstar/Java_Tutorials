package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManager {
    HashMap<String, Integer> students = new HashMap<>();

    public void saveStudents(String stdName, int stdScore){
        students.put(stdName, stdScore);
    }

    public void printStudents(){
        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    } // 자동으로 해주니까 tab 눌러서 완성시키긴 하는데 호출부분 이해 못했음

    public void checkPF(String stdName){
        int cutLine = 80;
        if(!students.containsKey(stdName)){
            System.out.println("Student " + stdName + " is not found");
            return;
        }
        if(students.get(stdName) >= cutLine){
            System.out.println(stdName + " is P");
        }else {
            System.out.println(stdName + " is F");
        }
    }

    public void changeScore(String stdName, int stdScore){
        if(!students.containsKey(stdName)){
            System.out.println("Student " + stdName + " is not found");
            return;
        }
        students.replace(stdName, stdScore);
        System.out.println("Student " + stdName + " has been changed to " + stdScore);
    }

    public static void main(String[] args) {
        StudentScoreManager sm = new StudentScoreManager();
        sm.saveStudents("김철수", 85);
        sm.saveStudents("이영희", 92);
        sm.saveStudents("박민수", 77);
        sm.saveStudents("최수진", 88);

        System.out.println("\n\nprintStudents() after default input");
        sm.printStudents();

        System.out.println("\n\ncheckPF()");
        sm.checkPF("김철수");
        sm.checkPF("이영희");
        sm.checkPF("박민수");
        sm.checkPF("최수진");

        String updateStdName = "박민수";
        int updateStdScore = 82;
        sm.changeScore(updateStdName, updateStdScore);

        System.out.println("\n\nprintStudents() after changeScore()");
        sm.printStudents();
    }
}
