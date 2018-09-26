public class Task4 {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 20185;

        if (isLastDayOfMonth(year, day, month)) {
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
            day = 1;
        } else {
            day++;
        }
        System.out.println(String.format("%02d.%02d.%04d", day, month, year));
    }

    public static boolean isLastDayOfMonth(int year, int day, int month) {
        switch (month) {
            case 2:
                if (day == 29) {
                    return true;
                } else if (day == 28) {
                    boolean leapYear = year % 100 == 0 ? (year / 100 % 4 == 0) : (year % 4 == 0);
                    return !leapYear;
                } else {
                    return false;
                }
            case 1:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 12:
                return day == 31;
            default:
                return day == 30;
        }
    }
}
