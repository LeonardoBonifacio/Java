package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class NextBussinesDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(18).with(new NextBussinesDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(12).with(new NextBussinesDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(31).with(new NextBussinesDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(29).with(new NextBussinesDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
