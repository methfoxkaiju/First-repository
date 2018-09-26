public class isTheLastNumberSeven {
    public static void main(String[] args) {
        int number = 1234568;
        int lastDigit = number % 10;
        if (lastDigit == 7) {
            System.out.println("Последняя цифра равна семи!");
        } else {
            System.out.println("Последняя цифра не равна семи!");
        }
    }
}