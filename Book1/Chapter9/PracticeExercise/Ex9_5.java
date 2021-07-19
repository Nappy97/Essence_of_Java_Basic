package com.nappy.Book1.Chapter9.PracticeExercise;

class Ex9_5 {
    public static String delChar(String src, String target){
        StringBuffer sb  = new StringBuffer(src.length());

        for(int i = 0; i<src.length();i++){
            char ch = src.charAt(i);

            if(target.indexOf(ch)==-1)
                sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)" , " \t"));
    }
}
