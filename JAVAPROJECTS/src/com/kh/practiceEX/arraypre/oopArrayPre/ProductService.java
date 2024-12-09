package com.kh.practiceEX.arraypre.oopArrayPre;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductService {

    // products : 제품 목록 저장할 배열리스트
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " 제품이 추가되었습니다.");
    }

    // 제품 목록 보기
    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("=== 제품 목록 ===");
            for(Product p : products){
                System.out.println(p);
                System.out.println("-------------");
            }
        }else {
            System.out.println("isEmpty");
        }
    }

    public Product searchProduct(String name) {
        for(Product p : products){ // 제품 목록을 순회
            if(p.getName().equalsIgnoreCase(name)){ // 검색한 이름과 목록에 있는 이름이 일치하면
                return p; // 찾는 이름과 존재하는 이름이 일치하는 제품 정보를 전달
            }
        }
        return null; // 찾는 정보가 없으면 null 전달
    }
}
