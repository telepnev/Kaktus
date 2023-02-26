package kaktus;

import java.util.Random;

public class Sensor {
    final Random r = new Random();
    private int randomWet;
    private String season;

    private int getRandomWet() {
        final Random r = new Random();
        int randomWet = r.nextInt(20, 50);
        return randomWet;
    }

    public static int removeSymbols(String dateNumber) {
        int integer = 0;
        if (dateNumber.startsWith("0")){
            String num = dateNumber.replace("0", "");
             integer = Integer.valueOf(num);
        }
        return integer;
    }

    public void getDateSeason(String day, String moth) {
        int numMonth = Sensor.removeSymbols(moth);
        int numDay = Sensor.removeSymbols(day);
//        Весна
        if (numMonth >= 3 && numMonth <= 5) {
           int dayz = numDay ;
           dayz += 7;
            if (numDay <= 30) {
                System.out.println("Кактус нужно поливать раз в неделю, полейте " + dayz + " числа");
            }
        }
//        Лето
        else if (numMonth >= 6 && numMonth <= 8) {
            if (getRandomWet() <= 30 && numDay % 2 == 0) {
                numDay += 2;
                if (numDay <= 30) {
                    System.out.println("Кактус нужно полить каждые два дня, тебе нужно полить = " + numDay + " числа");
                }
            }
        }
//        Осень
        else if (numMonth >= 9 && numMonth <= 11) {
            numDay += 7;
            if (numDay <= 30) {
                System.out.println("Кактус нужно поливать раз в неделю, полейте " + numDay + " числа");
            }
        }
//        Зима
        else if (numMonth == 12 || numMonth >= 1 && numMonth <= 2) {
            System.out.println("Сейчас Зима, тебе нужно полить через месяц");
        } else {
            System.out.println(" Введен не корректный месяц года");
        }
    }

}
