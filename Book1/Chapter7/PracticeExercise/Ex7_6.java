package com.nappy.Book1.Chapter7.PracticeExercise;

class Outer {
    class Inner {
        int iv = 100;
    }
}

class Ex7_6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner ii = o.new Inner();
        System.out.println("ii.iv = " + ii.iv);
    }
}
