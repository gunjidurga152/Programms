package org.example.Functions;

public class CallByValue {
    public static void main(String[] args) {
        int age = 24;
        System.out.println(age);
        ChangeAge(age);
        System.out.println(age);
    }

    public static void ChangeAge(int age) {
        age = 27;
    }
}
