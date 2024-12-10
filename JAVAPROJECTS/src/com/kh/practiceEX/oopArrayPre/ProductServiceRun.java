package com.kh.practiceEX.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        // 제품명 가격 입력받기
        // 제품 설명과 카테고리는 입력유무 물어본 후 yes 로 입력하면 제품설명과 카테고리 작성
        // no 입력하면 제품명과 가격만 저장
        System.out.println("Enter product name: ");
        String inputName = scanner.nextLine();

        System.out.println("Enter product price: ");
        int inputPrice = 0;
        try {
            inputPrice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Integer input");
        }
        scanner.nextLine();

        Product p1 = new Product(inputName, inputPrice);

        System.out.println("Wanna Enter product description? (yes/no) : ");
        String inputDescriptionYN = scanner.nextLine();
        if (inputDescriptionYN.equalsIgnoreCase("yes")) {
            System.out.println("Enter product description: ");
            String inputDescription = scanner.nextLine();
            p1.setDescription(inputDescription);
        } else if (inputDescriptionYN.equalsIgnoreCase("no")) {
            System.out.println("Didn't enter product description");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Wanna Enter product Category? (yes/no) : ");
        String inputCategoryYN = scanner.nextLine();
        if (inputCategoryYN.equalsIgnoreCase("yes")) {
            System.out.println("Enter product category: ");
            String inputCategory = scanner.nextLine();
            p1.setCategory(inputCategory);
        } else if (inputCategoryYN.equalsIgnoreCase("no")) {
            System.out.println("Didn't enter product category");
        } else {
            System.out.println("Invalid input");
        }

        productService.addProduct(p1);

        //p1 제품 추가
//        Product p1 = new Product("스마트폰", 100000);
//        p1.setDescription("최신 스마트폰입니다. 12/24 출고 예정");
//        p1.setCategory("전자기기");
//
//        Product p2 = new Product("노트북", 150000);
//        //p2 에서 제품설명이 null 값일 경우 없음으로 저장
//        //p2 에서 카테고리가 null 값일 경우 없음으로 저장
//        if(p2.getDescription() == null){
//            p2.setDescription("없음");
//        }
//        if (p2.getCategory() == null){
//            p2.setDescription("없음");
//        }
//
//        productService.addProduct(p1);
//        productService.addProduct(p2);

        // 제품목록 보기
        productService.viewProducts();

        // 제품명으로 제품검색
        Product sp = productService.searchProduct("노트북");
        if (sp != null) {
            System.out.println("검색된 제품 : " + sp);
        } else {
            System.out.println("해당 이름의 제품을 찾을 수 없습니다.");
        }
    }
}
