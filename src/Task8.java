public class Task8 {
    public static void main(String[] args) {
        int[] mas = {4, 18, 45, 76, 59, 42, 27, 16, 5, 80};
        int indexMax = 0;// индекс максимального элемента массива
        int indexMin = 0;// индекс минимального элемента массива

        for (int i = 1; i < mas.length; i++) {
            // i - индекс текущего числа в массиве
            int element = mas[i];
            int maxElement = mas[indexMax];
            if (element > maxElement) {
                indexMax = i;
            }
            int minElement = mas[indexMin];
            if (element < minElement) {
                indexMin = i;
            }
        }

        System.out.println(indexMax);
        System.out.println(mas[indexMax]);
        System.out.println(indexMin);
        System.out.println(mas[indexMin]);

        mas[indexMin] = 0;
        mas[indexMax] = 99;

        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");



    }
}
