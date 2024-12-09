package com.kh.practiceEX.arraypre.dbPre;

import java.util.Date;

// 추후 DB 컬럼명과 연결한 자바 변수명으로 DB와 자바변수명과 일치시켜주는 것이 좋음

public class Employee {

    private String emp_id;     //EMP_ID	VARCHAR2(3 BYTE)		1	사원번호
    private String emp_name;   //EMP_NAME	VARCHAR2(20 BYTE)		2	직원명
    private String emp_no;     // 14 BYTE -> 한글자씩 14자까지 작성 허용
    private String email;      //EMAIL	VARCHAR2(25 BYTE)		4	이메일
    private String phone;      //PHONE	VARCHAR2(12 BYTE)		5	전화번호
    private String dept_code;  //DEPT_CODE	CHAR(2 BYTE)		6	부서코드
    private String job_code;   // JOB_CODE CHAR(2 BYTE)
    private String sal_level;  //SAL_LEVEL	CHAR(2 BYTE)			8	급여등급
    private double salary;     //SALARY	NUMBER	9	급여
    private double bonus;      //BONUS	NUMBER		10	보너스율
    private String manager_id; //MANAGER_ID	VARCHAR2(3 BYTE)		11	관리자사번
    private Date hire_date;    //HIRE_DATE	DATE	12	입사일
    private Date ent_date;     //ENT_DATE	DATE		13	퇴사일
    private Date ent_yn;       //ENT_YN	CHAR(1 BYTE)		"'N'"	14	퇴직여부


}
