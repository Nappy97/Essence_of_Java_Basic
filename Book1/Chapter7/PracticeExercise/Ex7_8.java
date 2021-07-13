package com.nappy.Book1.Chapter7.PracticeExercise;

class Outer2 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer2.this.value);
        }

    }
}

class Ex7_8 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();

        inner.method1();

    }
}
