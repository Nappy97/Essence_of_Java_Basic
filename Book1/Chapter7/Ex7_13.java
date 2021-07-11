package com.nappy.Book1.Chapter7;

class Ex7_13 {
    class InstanceInner {
    }

    static class StaticInner {
    }

    // 인스턴스멤버 간에는 서로 직접 접근이 가능하다
    InstanceInner iv = new InstanceInner();
    // static 멤버 간에는 서로 직접 접근이 가능하다
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        //  static멤버는 인스턴스 멤버에서 직접 접근 불가
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 아래와 같이 객체를 생성해야한다
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다
        Ex7_13 outer = new Ex7_13();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        class LocalInner {
        }
        LocalInner lv = new LocalInner();
    }
}
