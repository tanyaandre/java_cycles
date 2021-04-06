package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetSum(String line) {
        StatsService service = new StatsService();
        //конвертируем строку в int
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getSum(resources);

        int expected = 180;

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetAverage(@org.jetbrains.annotations.NotNull String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getAverage(resources);

        int expected = 15;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetMaxMonth(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getMaxMonth(resources);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetMinMonth(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getMinMonth(resources);

        int expected = 9;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetOverAverage(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getOverAverage(resources);

        int expected = 5;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetUnderAverage(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getUnderAverage(resources);

        int expected = 5;

        assertEquals(expected, actual);
    }
}