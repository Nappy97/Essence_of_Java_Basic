package com.nappy.Book1.Chapter8;

class Ex8_9 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception{
        throw new Exception();
    }
}