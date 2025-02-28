package Homework8;

public class MonthUtils {

    public static final Month JANUARY = new Month("январь", 31, 17);
    public static final Month FEBRUARY = new Month("Февраль", 28, 20);
    public static final Month MARCH = new Month("Март", 31, 20);
    public static final Month APRIL = new Month("Апрель", 30, 22);
    public static final Month MAY = new Month("Май", 31, 19);
    public static final Month JUNE = new Month("Июнь", 30, 20);
    public static final Month JULY = new Month("Июль", 31, 23);
    public static final Month AUGUST = new Month("Август", 31, 21);
    public static final Month SEPTEMBER = new Month("Сентябрь", 30, 21);
    public static final Month OCTOBER = new Month("Октябрь", 31, 23);
    public static final Month NOVEMBER = new Month("Ноябрь", 30, 20);
    public static final Month DECEMBER = new Month("Декабрь", 31, 21);


    public static final Month[] ALL_MONTHS = {JANUARY, FEBRUARY, MARCH, APRIL, MAY,
                                              JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static final Month[] WINTER_MONTHS = {JANUARY, FEBRUARY, DECEMBER};

    public static final Month[] SPRING_MONTHS = {MARCH, APRIL, MAY};

    public static final Month[] SUMMER_MONTHS = {JUNE, JULY, AUGUST};

    public static final Month[] FALL_MONTHS = {SEPTEMBER, OCTOBER, NOVEMBER};

}
