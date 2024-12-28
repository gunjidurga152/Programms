package org.example.Strings;

class ToUpperCase {
    public static void main(String[] args) {
        String input="ganesha";
        String result=toUpperCase(input);
        System.out.println(result);

    }
    public static String toUpperCase(String input){
        String s=input.toUpperCase();
        return s;
    }
}
