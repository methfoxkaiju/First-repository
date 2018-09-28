import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        int prevDigit = number % 10;
        number /= 10;
        boolean sequence = true;

        do {
            int currentDigit = number % 10;
            if(prevDigit - currentDigit !=1){
                sequence = false;
                break;
            }
            prevDigit = currentDigit;
            number /= 10;
        }
        while (number != 0);

        if (sequence) {
            System.out.println("Последовательное");
        } else {
            System.out.println("не последовательное");
        }
    }
}
