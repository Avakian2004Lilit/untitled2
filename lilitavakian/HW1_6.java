package lilitavakian;

public class HW1_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100_000; i++){
            if (isNumberNatural(i)){
                System.out.println("натуральное число:" +i);
            }


        }
    }
    private static boolean isNumberNatural(int number){
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sumOfDividers += i;

            }

        }
        return sumOfDividers == 0;


    }
}
