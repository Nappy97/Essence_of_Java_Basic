package com.nappy.Book2.Chapter11;

import java.util.*;

class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바",100);
        map.put("이자바",100);
        map.put("강자바",80);
        map.put("안자바",90);
        
        Set set = map.entrySet();
        Iterator it = set.iterator();
        
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름: " + e.getKey() + ", 점수 : " + e.getValue());
        }
        
        set = map.keySet();
        System.out.println("참가자 명단 : " + set);
        
        Collection values = map.values();
        it = values.iterator();
        
        int total = 0;
        
        while (it.hasNext()){
            int i = (int)it.next();
            total += i;
        }

        System.out.println("total = " + total);
        System.out.println("(float)total/set.size() = " + (float)total/set.size());
    /*    System.out.println("Collection.max(values) = " + Collection.max(values));
        System.out.println("Collection.min(values) = " + Collection.min(values));*/
    }
}
