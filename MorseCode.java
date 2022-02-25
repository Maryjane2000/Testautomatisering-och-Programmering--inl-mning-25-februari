package Inlämning25februari;


import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        MorseTranslate translate = new MorseTranslate();
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        System.out.println(translate.getmorse(x));


    }
}

