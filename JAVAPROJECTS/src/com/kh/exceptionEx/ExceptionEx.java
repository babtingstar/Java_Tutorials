package com.kh.exceptionEx;

/*
try catch finally throws : 예외 처리를 관리하기 위해 사용

try - catch : try 블록에 예외가 발생할 가능성이 있는 코드를 작성
              발생한 예외상황을 catch 로 처리
              try 는 최초 1회만 작성, catch 는 다수 작성 가능

try - finally : try 블록에 예외가 발생할 가능성이 있는 코드를 작성
                예외처리 없이 문제가 발생하는 것과 별개로
                마지막에 무조건 실행해야 하는 코드를 finally 에 작성
                try, finally 는 무조건 최초 1회만 작성
                finally 는 주로 파일 닫기나 데이터베이스 연결 해제와 같은 구문에 사용

try - catch - finally : try 블록에 예외가 발생할 가능성이 있는 코드를 작성
                        발생한 예외상황을 catch 로 처리
                        마지막에 무조건 실행해야 하는 코드를 finally 에 작성

try - catch - catch - finally : try 블록에 예외가 발생할 가능성이 있는 코드를 작성
                                발생한 예외상황을 다수 작성해서 상황에 맞게 catch 로 처리
                                마지막에 작성하는 catch 는 보통 Exception 을 주로 작성
                                마지막에 무조건 실행해야 하는 코드를 finally 에 작성

try() - catch - finally : try 안에서 () 안에 닫기를 관리해야 하는 리소스를 작성하면 자동으로 닫음
                          Scanner File FileWriter FileReader BufferedReader In/Out PutStream

throws : 예외가 발생했을 경우 최초로 호출한 곳으로 문제 상황을 전달만 함
         예외/문제를 처리하지 않고 전달만 함

 */

public class ExceptionEx {
}
