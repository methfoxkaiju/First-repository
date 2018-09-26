public class Task3 {
    public static void main(String[] args) {
        int fullValue = 16700;
        int currentDayValue = fullValue % 86400;//86400 - кол-во сек в дне
        int currentHours = fullValue / 3600;//- кол-во часов в дне
        int currentMinutes = (currentDayValue - currentHours * 3600) / 60;//- кол-во минут в дне
        int currentSeconds = currentDayValue % 60;
        System.out.println(String.format("%02d:%02d:%02d", currentHours, currentMinutes, currentSeconds));// String.format заменяет параметры с указанным форматом
    }
}
