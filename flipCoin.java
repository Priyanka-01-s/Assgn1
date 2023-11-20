//package Assgn1;

import java.util.Scanner;


public class flipCoin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of flips");
        int numFlips = scanner.nextInt();

        int heads = 0;
        int tails = 0;

        for(int i =0;i<numFlips;i++){
            double randomNum = Math.random();

            if(randomNum < 0.5){
                tails++;
            }else{
                heads++;
            }
        }
        double headPercentage = (double)heads/numFlips*100;
        double tailPercentage = (double)tails/numFlips*100;

        System.out.println("Results after " + numFlips + " coin flips:");
        System.out.println("Heads: " + heads + " (" + headPercentage + "%)");
        System.out.println("Tails: " + tails + " (" + tailPercentage + "%)");

        scanner.close();
    }
}
