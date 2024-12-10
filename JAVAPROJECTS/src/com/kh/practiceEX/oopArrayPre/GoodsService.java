package com.kh.practiceEX.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {

    // 상품 목록 리스트
    private ArrayList<Goods> goodsList = new ArrayList<>();

    // 상품 추가 기능
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + " 상품이 추가되었습니다.");
    }

    // 상품 번호로 원하는 상품 가져오기 기능
    public Goods getGoodsById(int id) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        System.out.println("상품 " + id + "번 에 해당하는 상품을 찾을 수 없습니다.");
        return null; // 해당하는 상품이 없을 경우 빈 값 return
    }

    // todo : getGoodsByName(String name) 상품명으로 상품 조회
    public Goods getGoodsByName(String name) {
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) {
                return goods;
            }
        }
        System.out.println(name + " : 해당 상품이 없습니다.");
        return null;
    }
    // 모든 상품 보기 기능
    public void displayAllGoods() {
        if (goodsList.isEmpty()) {
            System.out.println("상품 리스트가 비었습니다.");
        } else {
            System.out.println("===== 상품 리스트 =====");
            for (Goods goods : goodsList) {
                System.out.println(goods.getName());
            }
        }
    }

    // 상품 삭제하기 기능
    public void removeGoods(int id) {
        Goods toGoods = null;
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                goodsList.remove(goods);
                break;
            }
        }
        if (toGoods == null) {
            System.out.println("상품번호 " + id + "로 조회된 상품이 존재하지 않습니다.");
        }else  {
            System.out.println("상품번호 " + id + "에 해당하는 상품을 삭제했습니다.");
        }
    }

}
