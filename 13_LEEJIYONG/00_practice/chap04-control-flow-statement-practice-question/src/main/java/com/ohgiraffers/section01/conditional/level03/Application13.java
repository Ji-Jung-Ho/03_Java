package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수 하나를 입력하세요 : 9
        * */
        System.out.print("정수하나를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printSpace(n-i);
            printStart(i);
            System.out.printf(" x %d + %d = ", i, 8, i);
            printResult(i);
        }


    }

    static void printStart(int n){
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=n ; i++) {
            sb.append(i);
        }

        System.out.print(sb);
    }

    static void printResult(int n){
        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >9-n ; i--) {
            sb.append(i);
        }

        System.out.println(sb);
    }

    static void printSpace(int n){
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }

        System.out.print(sb);
    }

}
