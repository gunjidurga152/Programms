package org.example.Strings;

public class StringToIntegerAndIntegerToString {
    public static void main(String[] args) {
        //String to integer
        String s="456";
        int i=300;
        Integer I=Integer.parseInt(s);
//        System.out.println(I.getClass().getName());

        //integer to string
        String st=String.format("%d",i);
//        System.out.println(st.getClass().getName());
    }

}
