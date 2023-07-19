import java.util.Scanner;

public class Palindrome {
    static int palindrome(String s, int start, int end) {
        if (start > end) {
            return 1;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return 0;
        }
        return palindrome(s, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int n= s.length();
        System.out.println( palindrome(s,0,n-1));

    }
}
