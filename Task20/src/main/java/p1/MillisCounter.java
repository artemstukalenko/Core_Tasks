package p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MillisCounter {
    public static void main(String[] args) {
        System.out.println(countMillis(LocalDate.now(), LocalDate.now().minusMonths(1)));
    }

    private static long countMillis(LocalDate startOfThePeriod,
                                    LocalDate endOfThePeriod) {

        int millisPerDay = 86_400_000;

        long sumOfMillis = 0l;

        for (LocalDate counter = startOfThePeriod; counter.isAfter(endOfThePeriod);) {
            counter = counter.minusDays(1);
            sumOfMillis += millisPerDay;
        }

        return sumOfMillis;
    }
}
