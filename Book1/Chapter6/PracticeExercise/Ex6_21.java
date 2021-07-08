package com.nappy.Book1.Chapter6.PracticeExercise;

public class Ex6_21 {
    public static int abs(int value) {
        return value >= 0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "절다값 " + abs(value));
        value = -10;
        System.out.println(value + "절대값 " + abs(value));
    }
}
