public class Task9 {
    public static void main(String[] args) {
        int[] mas = {2, 3, 4, 7, 6, 5, 7, 3, 7, 20};
        for (int i = 0; i < mas.length; i++) {
            int element = mas[i];
            boolean hasDuplicates = false;
            for (int j = 0; j < i && !hasDuplicates; j++) {
                if (mas[i] == mas[j]) {
                    hasDuplicates = true;
                }
            }

            if (!hasDuplicates) {
                int times = 1;

                for (int j = i + 1; j < mas.length; j++) {
                    if (mas[i] == mas[j]) {
                        times++;
                    }
                }
                if (times > 1) {
                    System.out.print("[" + element + "] - повторений " + times + ",");
                }
            }

        }
    }
}
