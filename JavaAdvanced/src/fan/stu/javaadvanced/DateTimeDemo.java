package fan.stu.javaadvanced;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeDemo {
    public static void main(String[] args) {
        
        localDateExample();

        localTimeExample();

        localDateTimeExample();

        zonedDateTimeExample();

        instantExample();
        
        periodExample();

        durationExample();

        yearMonthExample();

        weekMonthEnumExample();

        chronoFieldUnitExample();

        dateApiUtilities();

        dateParseFormatExample();

        dateTimeConversionExample();
    }

    private static void localDateExample() {
        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date = " + today);
 
        // Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date = " + firstDay_2014);
 
        // Try creating date by providing invalid inputs
        // LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        // Exception in thread "main" java.time.DateTimeException:
        // Invalid date 'February 29' as '2014' is not a leap year
 
        // Current date in "Asia/Ho_Chi_Minh", you can get it from ZoneId javadoc
        LocalDate todayHCM = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Date in IST = " + todayHCM);
 
        // java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        // LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
 
        // Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(1);
        System.out.println("365th day from base date = " + dateFromBase);
 
        // Obtains an instance of LocalDate from a year and day-of-year
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2021, 32);
        System.out.println("100th day of 2014 = " + hundredDay2014);
    }

    private static void localTimeExample() {
        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);
 
        // Creating LocalTime by providing input arguments
        // LocalTime.of(int hour, int minute, int second, int nanoOfSecond)
        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day = " + specificTime);
 
        // Try creating time by providing invalid inputs
        // LocalTime invalidTime = LocalTime.of(25,20);
        // Exception in thread "main" java.time.DateTimeException:
        // Invalid value for HourOfDay (valid values 0 - 23): 25
 
        // Current date in "Asia/Ho_Chi_Minh", you can get it from ZoneId javadoc
        LocalTime timeHCM = LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Time in IST = " + timeHCM);
 
        // java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        // LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));
 
        // Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time = " + specificSecondTime);
    }

    private static void localDateTimeExample() {
        // Current Date
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime = " + today);
 
        // Current Date using LocalDate and LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime = " + today);
 
        // Creating LocalDateTime by providing input arguments
        // LocalDateTime.of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date = " + specificDate);
 
        // Try creating date by providing invalid inputs
        // LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 28, 25,1,1);
        // Exception in thread "main" java.time.DateTimeException:
        // Invalid value for HourOfDay (valid values 0 - 23): 25
 
        // Current date in "Asia/Ho_Chi_Minh", you can get it from ZoneId javadoc
        LocalDateTime todayHCM = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current Date in IST = " + todayHCM);
 
        // java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        // LocalDateTime todayIST = LocalDateTime.now(ZoneId.of("IST"));
 
        // Getting date from the base date i.e 01/01/1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970 = " + dateFromBase);
    }

    private static void zonedDateTimeExample() {
        // Get all available zones
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("allZoneIds = " + allZoneIds);
         
        ZoneId zoneHCM = ZoneId.of("Asia/Ho_Chi_Minh");
 
        // Creating LocalDateTime by providing input arguments
        LocalDateTime today = LocalDateTime.now();
        System.out.println("LocalDateTime = " + today);
 
        // Creating ZonedDateTime by providing input arguments
        ZonedDateTime hcmDateTime = ZonedDateTime.of(today, zoneHCM);
        System.out.println("ZonedDateTime = " + hcmDateTime);
         
        // using offsets
        ZoneOffset offset = ZoneOffset.of("+05:00");
        System.out.println("offset = " + offset);
         
        OffsetDateTime todayPlusFive = OffsetDateTime.of(today, offset);
        System.out.println("todayPlusFive = " + todayPlusFive);
 
        OffsetDateTime todayMinusTwo = todayPlusFive.withOffsetSameInstant(ZoneOffset.ofHours(-2));
        System.out.println("todayMinusTwo = " + todayMinusTwo);
    }

    private static void instantExample() {
        // Current timestamp
        Instant now = Instant.now();
        System.out.println("Current Timestamp = " + now);
 
        // Instant from timestamp
        Instant specificTime = Instant.ofEpochMilli(now.toEpochMilli());
        System.out.println("Specific Time = " + specificTime);
 
        // Obtain an instance of Instant from a text string
        Instant specifyString = Instant.parse("2018-06-20T10:37:30.00Z");
        System.out.println("specifyString = " + specifyString);
         
        // Obtains a Duration representing a number of standard 24 hour days
        // return Duration with format of days*24
        Duration thirtyDay = Duration.ofDays(10);
        System.out.println(thirtyDay);
 
        // Copy of this instant with the specified amount subtracted
        Instant minus5 = now.minus(Duration.ofDays(1));
        System.out.println("minus5 = " + minus5);
 
        // Copy of this instant with the specified amount added
        Instant plus5 = now.plus(Duration.ofDays(5));
        System.out.println("plus5 = " + plus5);
    }

    private static void periodExample() {
        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2021, 6, 25);
        System.out.println("firstDate: " + firstDate); // 2018-06-23
        System.out.println("secondDate: " + secondDate); // 2017-05-20
 
        Period period = Period.between(firstDate, secondDate);
        System.out.println("period: " + period); // P-1M-3D
 
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();
        boolean isNegative = period.isNegative();
        System.out.println("days: " + days); // -3
        System.out.println("months: " + months); // -1
        System.out.println("years: " + years); // -1
        System.out.println("isNegative: " + isNegative); // true
 
        Period twoMonthTenDays = Period.ofMonths(2).plusDays(100);
        System.out.println("twoMonthTenDays: " + twoMonthTenDays); // P2M10D
         
        LocalDate plusDate = firstDate.plus(twoMonthTenDays);
        System.out.println("plusDate: " + plusDate); // 2018-09-02
         
        LocalDate minusDate = firstDate.minus(twoMonthTenDays);
        System.out.println("minusDate: " + minusDate); // 2018-04-13
    }

    private static void durationExample() {
        LocalDateTime firstDate = LocalDateTime.now();
        LocalDateTime secondDate = LocalDateTime.of(2018, 6, 20, 0, 0, 0);
        System.out.println("firstDate: " + firstDate); // 2018-06-23T21:31:28.924
        System.out.println("secondDate: " + secondDate); // 2018-06-20T00:00
 
        // Obtains a Duration representing the duration between two temporal objects
        // The temporal objects are Instant or LocalDateTime
        Duration duration = Duration.between(firstDate, secondDate);
        System.out.println("duration: " + duration); // PT-93H-31M-28.924S
 
        long days = duration.toDays();
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds();
        long millis = duration.toMillis();
        long nanos = duration.toNanos();
        System.out.println("days: " + days); // -3
        System.out.println("hours: " + hours); // -93
        System.out.println("minutes: " + minutes); // -5611
        System.out.println("seconds: " + seconds); // -336689
        System.out.println("millis: " + millis); // -336688924
        System.out.println("nanos: " + nanos); // -336688924000000
         
        Duration twoHours = Duration.ofHours(2);
        System.out.println("twoHours: " + twoHours); // PT2H
         
        LocalDateTime plusDate = firstDate.plus(twoHours);
        System.out.println("plusDate: " + plusDate); // 2018-06-23T23:35:21.045
         
        LocalDateTime minusDate = firstDate.minus(twoHours);
        System.out.println("minusDate: " + minusDate); // 2018-06-23T19:35:21.045
    }

    private static void yearMonthExample() {
        Year currentYear = Year.now();
        System.out.println("currentYear: " + currentYear); // 2018
 
        Year specifyYear = Year.of(2016);
        System.out.println("specifyYear: " + specifyYear); // 2016
        System.out.println("isLeap : " + specifyYear.isLeap()); // true
 
        int dayOfYear = 100;
        LocalDate localDate = currentYear.atDay(dayOfYear);
        System.out.println("localDate: " + localDate); // 2018-04-10
 
        // YearMonth Example
 
        YearMonth currentYearMonth = YearMonth.now();
        System.out.println("currentYearMonth: " + currentYearMonth);
 
        YearMonth specifyYearMonth = YearMonth.of(2016, 1);
        System.out.println("specifyYearMonth: " + specifyYearMonth);
 
        int dayOfMonth = 20;
        LocalDate localDate2 = currentYearMonth.atDay(dayOfMonth);
        System.out.println("localDate2: " + localDate2); // 2018-06-20
 
        // Year -> YearMonth
 
        YearMonth ym = currentYear.atMonth(12);
        System.out.println("ym: " + ym); // 2018-05
    }

    private static void weekMonthEnumExample() {
         // DayOfWeek Enum Example
         DayOfWeek monday = DayOfWeek.MONDAY;
         System.out.println(monday); // MONDAY
         System.out.println(monday.getDisplayName(TextStyle.SHORT, Locale.getDefault())); // Mon
         System.out.println(monday.getDisplayName(TextStyle.FULL, Locale.getDefault())); // Monday
         System.out.println(monday.plus(5)); // SATURDAY
         System.out.println(DayOfWeek.of(1)); // MONDAY
         System.out.println(DayOfWeek.of(7)); // SUNDAY
         System.out.println(DayOfWeek.valueOf("SUNDAY")); // SUNDAY
         System.out.println(monday.compareTo(DayOfWeek.SUNDAY)); // -6
          
         // Month Enum Example
         Month april = Month.APRIL;
         System.out.println(april); // APRIL
         System.out.println(april.getDisplayName(TextStyle.SHORT, Locale.getDefault())); // Apr
         System.out.println(april.getDisplayName(TextStyle.FULL, Locale.getDefault())); // April
         System.out.println(april.plus(3)); // JULY
         System.out.println(Month.FEBRUARY.maxLength()); // 29
         System.out.println(Month.FEBRUARY.minLength()); // 28
         System.out.println(Month.MARCH.firstDayOfYear(true)); // 92
         System.out.println(Month.of(1)); // JANUARY
         System.out.println(Month.of(12)); // DECEMBER
         System.out.println(Month.valueOf("FEBRUARY"));
    }

    private static void chronoFieldUnitExample() {
        // ====== ChronoUnit Example ======
 
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
 
        // add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);
 
        // add 1 week to the current date
        LocalDate previousWeek = today.minus(1, ChronoUnit.WEEKS);
        System.out.println("Previous week: " + previousWeek);
 
        // add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);
 
        // add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);
 
        // add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
 
        // ====== ChronoField Example ======
 
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\ncurrentDateTime: " +currentDateTime);
        System.out.println("Year: " + currentDateTime.get(ChronoField.YEAR));
        System.out.println("Month: " + currentDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Day of month: " + currentDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour of day: " + currentDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute of hour: " + currentDateTime.get(ChronoField.MINUTE_OF_HOUR));
    }

    private static void dateApiUtilities() {
        LocalDate today = LocalDate.now();
 
        // Get the Year, check if it's leap year
        System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());
 
        // Compare two LocalDate for before and after
        System.out.println("Today is before 01/01/2018? " + today.isBefore(LocalDate.of(2018, 1, 1)));
 
        // Create LocalDateTime from LocalDate
        System.out.println("Current Time = " + today.atTime(LocalTime.now()));
 
        // plus and minus operations
        System.out.println("10 days after today will be " + today.plusDays(10));
        System.out.println("3 weeks after today will be " + today.plusWeeks(3));
        System.out.println("20 months after today will be " + today.plusMonths(20));
 
        System.out.println("10 days before today will be " + today.minusDays(10));
        System.out.println("3 weeks before today will be " + today.minusWeeks(3));
        System.out.println("20 months before today will be " + today.minusMonths(20));
 
        // Temporal adjusters for adjusting the dates
        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First date of this month= " + firstDayOfThisMonth);
         
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last date of this month= " + lastDayOfThisMonth);
         
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= " + lastDayOfYear);
 
        Period period = today.until(lastDayOfYear);
        System.out.println("Period Format= " + period);
        System.out.println("Months remaining in the year= " + period.getMonths());
    }

    private static void dateParseFormatExample() {
        // Format LocalDate examples
        LocalDate date = LocalDate.now();
        System.out.println("Default format of LocalDate = " + date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
 
        // Format LocalDateTime examples
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nDefault format of LocalDateTime = " + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
 
        // Format Instant Example
        Instant timestamp = Instant.now();
        System.out.println("\nDefault format of Instant = " + timestamp);
 
        // Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("\nDefault format after parsing = " + dt);
    }

    private static void dateTimeConversionExample() {
        // LocalDate/ LocalTime <-> LocalDateTime/ ZonedDateTime
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTimeFromDateAndTime = LocalDateTime.of(date, time);
        LocalDate dateFromDateTime = dateTimeFromDateAndTime.toLocalDate();
        LocalTime timeFromDateTime = dateTimeFromDateAndTime.toLocalTime();
        ZonedDateTime hcmDateTime = ZonedDateTime.of(dateTimeFromDateAndTime, ZoneId.of("Asia/Ho_Chi_Minh"));
 
        // Convert old classes to Java 8 Date Time
        Instant instantFromDate = new Date().toInstant();
        ZoneId zoneId = TimeZone.getDefault().toZoneId();
        Instant instantFromCalendar = Calendar.getInstance().toInstant();
        ZonedDateTime zonedDateTime = new GregorianCalendar().toZonedDateTime();
 
        // Instant <-> LocalDateTime
        Instant instant = Instant.now();
        LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        Instant instantFromLocalDateTime = dateTimeFromInstant.toInstant(ZoneOffset.ofHours(+7));
 
        // Instant <-> LocalDate
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        Instant instantFromLocalDate = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
 
        // Convert Java 8 Date Time to old classes
        Date dateFromInstant = Date.from(Instant.now());
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("Asia/Ho_Chi_Minh"));
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(ZonedDateTime.now());
    }
}
