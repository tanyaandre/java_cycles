package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] proceeds = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = getSum(proceeds);
        System.out.println("Сумма всех продаж: " + sum + " руб.;");

        int average = getAverage(proceeds);
        System.out.println("Средняя сумма за месяц: " + average + " руб.;");

        int maxMonth = getMaxMonth(proceeds);
        System.out.println("Месяц с максимальными продажами: " + maxMonth);

        int minMonth = getMinMonth(proceeds);
        System.out.println("Месяц с минимальными продажами: " + minMonth);

        int overAverage = getOverAverage(proceeds);
        System.out.println("Месяцев с продажами выше среднего: " + overAverage);

        int underAverage = getUnderAverage(proceeds);
        System.out.println("Месяцев с продажами ниже среднего: " + underAverage);
    }

    public static int getSum(int[] proceeds) {
        // считаем сумму продаж
        int sum = 0;
        for (int proceed : proceeds) {
            sum += proceed;
        }
        return sum;
    }

    public static int getAverage(int[] proceeds) {
        // считаем среднюю сумму продаж в меясц
        int proceedsAverage = getSum(proceeds) / proceeds.length;
        return proceedsAverage;
    }

    public static int getMaxMonth(int[] proceeds) {
        //вычисляем месяц с максимальными продажами
        int proceedsMax = proceeds[0];
        int month = 0;
        int maxMonth = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMax <= proceed) {
                proceedsMax = proceed;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public static int getMinMonth(int[] proceeds) {
        //вычисляем месяц с максимальными продажами
        int proceedsMin = proceeds[0];
        int month = 0;
        int minMonth = 1;
        for (int proceed : proceeds) {
            month++;
            if (proceedsMin >= proceed) {
                proceedsMin = proceed;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public static int getOverAverage(int[] proceeds) {
        int proceedsAverage = getAverage(proceeds);
        int count = 0;
        int overAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage < proceed) {
                count++;
                overAverage = count;
            }
        }
        return overAverage;
    }

    public static int getUnderAverage(int[] proceeds) {
        int proceedsAverage = getAverage(proceeds);
        int count = 0;
        int underAverage = 0;
        for (int proceed : proceeds) {
            if (proceedsAverage > proceed) {
                count++;
                underAverage = count;
            }
        }
        return underAverage;
    }
}
