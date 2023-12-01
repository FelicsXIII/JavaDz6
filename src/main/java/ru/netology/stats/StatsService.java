package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {// сумма всех продаж
        long sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    public long averageSumSales(long[] sales) {// среднее сумма продаж
        long averageSum = sumSales(sales) / 12;
        return averageSum;
    }

    public int monthNumberMaxSales(long[] sales) { //месяц с максимальными продажами
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthNumberMinSales(long[] sales) {// месяц с минимальными продажами
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int monthsDownAverageSales(long[] sales) { // кол во месяцев ниже среднего
        int monthUp = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales(sales)) {
                monthUp++;
            }
        }
        return monthUp;
    }

    public int monthsUpAverageSales(long[] sales) { //кол во месяцев выше среднего
        int monthDown = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales(sales)) {
                monthDown++;
            }
        }
        return monthDown;
    }
}
