package com.nappy.Book1.Chapter7.PracticeExercise;

class Outer1 {
    static class Inner {
        int iv = 200;
    }
}

class Ex7_7 {
    public static void main(String[] args) {
        Outer1.Inner ii = new Outer1.Inner();
        System.out.println("ii.iv = " + ii.iv);

    }
}
