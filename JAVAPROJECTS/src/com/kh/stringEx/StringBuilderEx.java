package com.kh.stringEx;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilderEx stringBuilderEx = new StringBuilderEx();
        stringBuilderEx.method1();
    }
   public void method1(){
       StringBuilder s1 = new StringBuilder();
       s1.append("hello");
       s1.append("world");
       System.out.println(s1);
   }
}
