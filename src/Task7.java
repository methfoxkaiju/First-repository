public class Task7 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 5, 21, 23, 26, 18, 30, 115879654};

        for (int i = 0; i < mas.length; i++) {
            int number = mas[i];// i - позиция числа в массиве
            int lastNumber = number % 10;
            int lastTwoDigits = number % 100;

            String postfix;

            switch (lastNumber) {
                case 1:
                    if (lastTwoDigits == 11) {
                        postfix = "рублей";
                    } else {
                        postfix = "рубль";
                    }
                    break;
                case 2:
                    if (lastTwoDigits == 12) {
                        postfix = "рублей";
                    } else {
                        postfix = "рубля";
                    }
                    break;
                case 3:
                    if (lastTwoDigits == 13) {
                        postfix = "рублей";
                    } else {
                        postfix = "рубля";
                    }
                    break;
                case 4:
                    if (lastTwoDigits == 14) {
                        postfix = "рублей";
                    } else {
                        postfix = "рубля";
                    }
                    break;
                default:
                    postfix = "рублей";
            }
            System.out.println(String.format("%s %s", number, postfix));
        }
    }
}
