package exception;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a<0 || b<0){
            throw new RuntimeException("Please type positive values only");
        }
        System.out.println(a+b);
    }
}
