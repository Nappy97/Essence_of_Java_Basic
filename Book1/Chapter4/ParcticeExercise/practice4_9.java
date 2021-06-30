package com.nappy.Book1.Chapter4.ParcticeExercise;

public class practice4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num>0){
            sum+=num%10;
            num/=10;
        }

        System.out.println("sum = " + sum);
    }
}
