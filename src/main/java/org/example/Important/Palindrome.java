package org.example.Important;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        int left = 0;
        int right =input.length()-1;

        while(left<right){
            if(input.charAt(left)!=input.charAt(right)){
                isPalindrome = false;
                break;
            }
               left++;
               right--;
        }
            if(isPalindrome){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
    }
}

