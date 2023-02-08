package com.mycompany.LinkedList;

public class test {
    public static void main(String[] args) {
//        float a =1;
//        float b =3;
////        DecimalFormat decimalFormat = new DecimalFormat("0.00");
////        String divide = (decimalFormat.format((float) a / (float) b));
////        double c=(double)(Math.round(b/a)/100.0);
//        double c = (double)(Math.round(a*100/b)/100.0);
//
//        System.out.println(c);

    }
    String greatestLetter(String s) {
        int[] record = new int[59];
        int target = -1;
        for(char c : s.toCharArray()){
            record[c-'A'] += 1;
        }
        for(int i = 0 ; i < 25; i++ ){
            if(record[i]>0 && record[i+32] > 0){
                target = i;
            }
        }

        if(target  == -1 ){
            return "";
        }else if (target >= 0){
            char num = (char)(target + 'A');
            return Character.toString(num);
        }

        return "";

    }



    class Solution {
        public String greatestLetter(String s) {
            int[] record = new int[59];
            int target = -1;
            for(char c : s.toCharArray()){
                record[c-'A'] += 1;
            }
            for(int i = 0 ; i < 26; i++ ){
                if(record[i]>0 && record[i+32] > 0){
                    target = i;
                }
            }

            if(target  == -1 ){
                return "";
            }else if (target >= 0){
                char num = (char)(target + 'A');
                return Character.toString(num);
            }

            return "";

        }
    }
}
