import ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = service.sumSales(sales) / 12;
        long actual = service.averageSumSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.monthNumberMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.monthNumberMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldmonthsDownAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsDownAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldmonthsUpAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsUpAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}

