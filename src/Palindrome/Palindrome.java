package Palindrome;

public class Palindrome {
    String word;
    public boolean isPalindrome() {
        String word = this.word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void display(){
        if(this.isPalindrome()){
            System.out.println(this.word + " est un palindrome.");
        } else {
            System.out.println(this.word + " n'est pas un palindrome.");
        }
    }
}