package com.kh.collectionEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    /*
    Entry<Key, Value>
    키 - 값 쌍으로 데이터를 저장하는 구조
    키는 중복을 허용하지 않지만, 값은 중복을 허용
    키 = Key 값 = Value
    대표적인 클래스 : HashMap, LinkedHashMap, TreeMap

     특징
     키는 중복 허용하지 않음 : 동일한 키로 여럽 데이터를 저장하면, 새로운 값으로 덮어쓰기
     값은 중복 허용 : 동일한 값은다른 키에 여러 번 저장될 수 있음
     순서 : HashMap 은 순서를 보장하지 않지만
            LinkedHashMap 은 입력 순서를 유지하고
            TreeMap 은 키의 자연 순서 or 지정된 순서로 정렬

     메서드
     put(K key, V value) : 지정한 키에 해당하는 값을 지정
     get(Object key) : 지정한 키에 해당하는 값을 반환
     remove(Object key) : 지정한 키에 해당하는 요소(=값) 삭제
     containsKey(Object key) : 지정한 키가 존재하는 지 확인
     containsValue(Object value) : 지정한 값이 존재하는 지 확인
     size() : Map 에 저장된 요소(=값)의 개수를 반환
     clear() : 모든 요소(=값) 삭제
     keySet() : 저장된 모든 키를 Set 으로 반환
     values() : 저장된 모든 값을 Collection 으로 반환
     entrySet() : 저장된 모든 엔트리(키-값 쌍)을 set 으로 반환

     사용법
            Map<String, String> 변수이름 = new HashMap<String, String>();
        HashMap<String, String> 변수이름 = new HashMap<String, String>();

        키가 숫자이고, 값이 String 일 때
            HashMap<Integer, String> 변수이름 = new HashMAp<Integer, String>();

     */

    public static void main(String[] args) {

        //HashMap 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("포도", 3000);

        System.out.println("사과 가격 : " + map.get("사과"));
        System.out.println("물가가 올랐습니다. ");
        map.put("사과", 1500);
        String hasBanana = (map.containsKey("바나나")) ? "YES" : "NO";
        System.out.println("바나나를 판매중인가요? : " + hasBanana);
        System.out.println("3000원 짜리 과일이 존재합니까 ? : " + map.containsValue(3000));
        System.out.println("바나나가 품절됐습니다.");
        map.remove("바나나");
        System.out.println("과일의 종류 수는? : " + map.size());

        System.out.println("모든 키 확인 : " + map.keySet());
        System.out.println("모든 값 확인 : " + map.values());
        System.out.println("모든 키 확인 : " + map.entrySet());
        System.out.println(map.toString());
    }
}
