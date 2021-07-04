package com.nappy.Book1.Chapter6;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel1값은 " + t1.channel1 + "입니다");
        System.out.println("t2의 channel1값은 " + t2.channel1 + "입니다");

        t1.channel1 = 7;
        System.out.println("t1의 channel1값을 7로 변경하였습니다");

        System.out.println("t1의 channel1값은 " + t1.channel1 + "입니다");
        System.out.println("t2의 channel1값은 " + t2.channel1 + "입니다");
    }
}
