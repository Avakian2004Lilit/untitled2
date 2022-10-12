package homworck1;

import java.util.Calendar;
import java.util.Random;

public class Season2 {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(12)+1;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В какое время года попадает месяц");
        }
    }

    }
