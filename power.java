//package Assgn1;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int power = sc.nextInt();

        if (power < 0 || power >= 31) {
            System.out.println("N should be in the range 0 <= N < 31.");
            return;
        }

        System.out.println("Powers of 2 up to 2^" + power + ":");

        for(int i =0;i<=power;i++){
            int res = (int)Math.pow(2, i);
            System.out.println("2^"+i+" = "+ res);
        }
        sc.close();
    }
}
