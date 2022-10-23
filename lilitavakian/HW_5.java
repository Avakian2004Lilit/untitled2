package lilitavakian;

public class HW_5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean isPrise = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrise = false;
                    break;
                }

            }
            if(isPrise){
                System.out.println(i);
            }
        }
    }

    }
