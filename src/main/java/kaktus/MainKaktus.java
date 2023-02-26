package kaktus;

import java.util.Scanner;

public class MainKaktus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sensor sensor = new Sensor();

        System.out.print("Введите День последнего полива кактуса = ");
        String day = scanner.nextLine();

        System.out.print("Введите Месяц последнего полива кактуса = ");
        String month = scanner.nextLine();

        sensor.getDateSeason(day,month);
        System.out.println("--------------------");



    }
}
