package ru.netology.javaqa.services;

public class CalcMonthService {
    public int calculate(int income, int expence, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expence) / 3;
            } else {
                money = money + income - expence;
            }
        }
        return count;
    }

}