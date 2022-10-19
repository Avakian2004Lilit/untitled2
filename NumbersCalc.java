package homwork18okt;

import java.util.Random;

public class NumbersCalc {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int sumOfOdd = 0;
        System.out.println(number);
        while (number > 0){
            int odd = number % 10;
            sumOfOdd += odd;
            number /= 10;
        }
        System.out.println(sumOfOdd);

    }
}
