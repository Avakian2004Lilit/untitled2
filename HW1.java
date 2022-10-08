package classwork5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWindy = false;
        boolean canSwim = isSunny && isWindy;
        System.out.println("Солнечно и не дует вветер " + canSwim);

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду,это .." + canBuy);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isDividedFor4And6(number) );


    }

    static boolean howe(String str){
        return str.length() < 7;

    }

    static boolean isDividedFor4And6(int number) {
        boolean isDivedFor4 = number % 4 == 0;
        boolean isDivedFor6 = number % 6 == 0;
        return isDivedFor4 && isDivedFor6;



    }


}







