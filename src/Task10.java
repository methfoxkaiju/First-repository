public class Task10 {
    public static void main(String[] args) {
        int mas[] = {5, 8, 4, 9, 10, 45, 7};
        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        for (int i = 0, j = mas.length - 1; i < j; i++, j--) {
            int temp = mas[i]; // temp - временная переменная,для хранения значения одной из ячеек
            mas[i] = mas[j];
            mas[j] = temp;
        }

        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
