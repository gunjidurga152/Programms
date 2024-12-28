package org.example.Strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="   I Love My      country ";
        String str1=str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
