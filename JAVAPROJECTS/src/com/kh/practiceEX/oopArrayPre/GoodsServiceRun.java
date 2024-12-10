package com.kh.practiceEX.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1. 상품 추가하기");
            System.out.println("2. 상품 목록 보기");
            System.out.println("3. 상품 번호로 조회하기");
            System.out.println("4. 상품 번호로 제거하기");
            System.out.println("5. 종료하기");
            System.out.print("번호를 선택하세요 : ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("상품 추가하기");
                    System.out.println("상품의 ID를 입력해주세요 : ");
                    int inputId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("상품의 이름을 입력해주세요 : ");
                    String inputName = scanner.nextLine();
                    System.out.println("상품의 가격을 입력해주세요 : ");
                    double inputPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("상품의 갯수를 입력해주세요 : ");
                    int inputQuantity = scanner.nextInt();
                    scanner.nextLine();
                    Goods goods = new Goods(inputId, inputName, inputPrice, inputQuantity);
                    goodsService.addGoods(goods);
                    break;
                case 2:
                    System.out.println("상품 목록 보기");
                    goodsService.displayAllGoods();
                    break;
                case 3:
                    System.out.println("상품 번호로 조회하기");
                    System.out.println("상품의 ID를 입력해주세요 : ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    String returnedName = goodsService.getGoodsById(searchId).getName();
                    System.out.println(returnedName);
                    break;
                case 4:
                    System.out.println("상품 번호로 제거하기");
                    System.out.println("상품의 ID를 입력해주세요 : ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    goodsService.removeGoods(deleteId);
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    return;

                default:
                    System.out.println("잘못 입력했습니다. 숫자만 입력 가능합니다.");
                    break;
            }
        }
    }
}
