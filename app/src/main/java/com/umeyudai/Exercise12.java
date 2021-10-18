package com.umeyudai;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 : ");
        int n1 = input.nextInt();
        System.out.print("n2 : ");
        int n2 = input.nextInt();
        System.out.print("n3 : ");
        int n3 = input.nextInt();

        System.out.println((n1 + n2 + n3) / 3);


        Scanner input2 = new Scanner(System.in);
        System.out.print("count : ");
        int count = input2.nextInt();
        int sum = 0;
        int x = 1;
        while (x <= count) {
            System.out.println((int) x + " : ");
            sum += input2.nextInt();
            x += 1;
        }
        System.out.println(sum / count);

        input.close();
        input2.close();
    }
}
