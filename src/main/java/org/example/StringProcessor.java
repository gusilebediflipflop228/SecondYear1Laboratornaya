package org.example;

public class StringProcessor {
    public static String multiplyOfString(String s, int n) {
        if (n == 0) return "";
        if (n < 0) throw new IllegalArgumentException("Отрицательная длинна строки");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < n; i++) {
            string.append(s);
        }
        return string.toString();
    }

    public static int searchForSubstring(String s1,String s2){
        if (s2.isEmpty()) throw new IllegalArgumentException("Вторая строка пустая");
        int count = 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            if (s1.startsWith(s2,i)) count ++;
        }
        return count;
    }

    public static String replaceNums (String s){
        String str;
        str = s.replace("1", "один")
                .replace("2","два")
                .replace("3","три");
        return str;
    }

    public static StringBuilder delStr(StringBuilder stringBuilder){
        for (int i = 1; i<stringBuilder.length();i++){
            stringBuilder.deleteCharAt(i);
        }
        return stringBuilder;
    }

}


