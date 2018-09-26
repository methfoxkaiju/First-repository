public class Task5 {
    public static void main(String[] args) {
        String str = "Мама мыла раму,а рама мыла маму";
        int length = str.length();
        System.out.println(length);
        int middlePosition = length / 2;
        String firstHalf = str.substring(0, middlePosition);
        String secondHalf = str.substring(middlePosition, length);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
