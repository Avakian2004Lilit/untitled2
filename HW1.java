package homwork18okto;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();
        int sumOfNumber = naturalNumber;
        int howTimeCount = 0;
        while (sumOfNumber > 0){
            howTimeCount++;
            int maxDivider =maxDivider(sumOfNumber);
            sumOfNumber -= maxDivider;

        }
        System.out.println(howTimeCount);
    }

    static int maxDivider(int number){
        for (int i = number /2; i > 0;i--){
            if (number % i == 0){
                return i;
            }

        }
        return 1;

}
