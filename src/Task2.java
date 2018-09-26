public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int radius = 4;
        double c = Math.sqrt(a * a + b * b) / 2;
        if (radius >= c) {
            System.out.println("Картонка закроет отверстие");
        } else {
            System.out.println("Картонка не закроет отверстие");
        }
    }
}
