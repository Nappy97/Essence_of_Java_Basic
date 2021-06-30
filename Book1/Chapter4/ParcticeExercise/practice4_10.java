package com.nappy.Book1.Chapter4.ParcticeExercise;

import java.util.Scanner;

public class practice4_10 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        java.util.Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt();

            if (input > answer) {
                System.out.println("더 작은수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("정답입니다");
                System.out.println("시도횟수는" + count + "입니다");
                break;
            }
        } while (true);
    }
}
