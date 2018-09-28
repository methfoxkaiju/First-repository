public class Task12 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 5, 79, 65, 4};

        //по возравстанию
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j]; // temp - временная переменная,для хранения значения одной из ячеек
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");


        int[] newMas = {1, 2, 5, 79, 65, 4};
        //по убыванию
        for (int i = 0; i < newMas.length; i++) {
            for (int j = 0; j < newMas.length - 1; j++) {
                if (newMas[j] < newMas[j + 1]) {
                    int temp = newMas[j]; // temp - временная переменная,для хранения значения одной из ячеек
                    newMas[j] = newMas[j + 1];
                    newMas[j + 1] = temp;
                }
            }
        }


        System.out.print("[");
        for (int i = 0; i < newMas.length; i++) {
            System.out.print(newMas[i]);
            if (i != newMas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
