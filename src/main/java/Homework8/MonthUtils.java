package Homework8;

import java.util.Arrays;

public class MonthUtils {

    private static final Month JANUARY = new Month("январь", 31, 17);
    private static final Month FEBRUARY = new Month("Февраль", 28, 20);
    private static final Month MARCH = new Month("Март", 31, 20);
    private static final Month APRIL = new Month("Апрель", 30, 22);
    private static final Month MAY = new Month("Май", 31, 19);
    private static final Month JUNE = new Month("Июнь", 30, 20);
    private static final Month JULY = new Month("Июль", 31, 23);
    private static final Month AUGUST = new Month("Август", 31, 21);
    private static final Month SEPTEMBER = new Month("Сентябрь", 30, 21);
    private static final Month OCTOBER = new Month("Октябрь", 31, 23);
    private static final Month NOVEMBER = new Month("Ноябрь", 30, 20);
    private static final Month DECEMBER = new Month("Декабрь", 31, 21);


    private static final Month[] ALL_MONTHS = {JANUARY, FEBRUARY, MARCH, APRIL, MAY,
                                              JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    //public static final Month[] WINTER_MONTHS = {JANUARY, FEBRUARY, DECEMBER};

    //public static final Month[] SPRING_MONTHS = {MARCH, APRIL, MAY};

//    public static final Month[] SUMMER_MONTHS = {JUNE, JULY, AUGUST};
//
//    public static final Month[] FALL_MONTHS = {SEPTEMBER, OCTOBER, NOVEMBER};

    public static Month[] getMonth(String ... months) {
        if (months == null) {
            return null;
        }
        Month[] res = new Month[ALL_MONTHS.length];
        int k = 0;
        for (String monthStr : months) {
            for (Month nextMonth : ALL_MONTHS) {
                if (nextMonth.getName().equals(monthStr)) {
                    res[k++] = nextMonth;
                }
            }
        }
        return Arrays.copyOf(res, k);
    }

}
