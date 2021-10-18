package com.umeyudai;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = input.nextInt();
        for(int i = 0; i<10; i++){
            System.out.println(n1 * (i + 1));
        }
        input.close();
    }
}
