package method;

import method.patient.Patient;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Patient[] mas = new Patient[3]; //массив для 3 пациентов

        fillPatients(mas);//заполняем пациентов с консоли
        printPatients(mas);//выводим пациентов в консоль

        findByNameAndPrint(mas);//ищем по фио (фио вводится внутри метода)
        findByAgeAndPrint(mas);//ищем по возрасту (возраст вводится внутри метода)
    }

//    Сигнатура метода:
//    1) модификатор доступа (public | protected | private)
//    2) static - если хочешь чтобы к методу нужно было обращаться не через инстанс, а через класс
//    3) возвращаемый тип - void, int, String , Object и все другие типы
//    4) название метода
//    5) параметры в скобках , сначала тип параметра и потом его локальное название (может отличаться от того которое ты передашь)

    public static void fillPatients(Patient[] patients) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < patients.length; i++) {
            Patient patient = new Patient();
            System.out.print("Введите ФИО : ");
            patient.fullName = scanner.nextLine();
            System.out.print("Введите возраст : ");
            patient.age = scanner.nextInt();
            scanner.nextLine();//особенность nextInt(), после него нужно nextLine()
            System.out.print("Введите диагноз : ");
            patient.diagnosis = scanner.nextLine();
            System.out.print("Замужем/Женат (true/false): ");
            patient.married = scanner.nextBoolean();
            scanner.nextLine();//особенность nextBoolean(), после него нужно nextLine()
            System.out.print("Введите цвет волос:");
            patient.hairColor = scanner.nextLine();
            System.out.print("Введите сумму заработка:");
            patient.salary = scanner.nextInt();
            scanner.nextLine();

            patients[i] = patient;
        }
    }

    private static void findByNameAndPrint(Patient[] patients) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО для поиска : ");
        String fullName = scanner.nextLine();//получаем ФИО с консоли
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].fullName.equals(fullName)) {//если ФИО паиента совпадает в введенным
                printPatient(patients[i]);//выводим данные пациента в консоль
            }
        }
    }

    private static void findByAgeAndPrint(Patient[] patients) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст для поиска : ");//получаем возраст с консоли
        int age = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].age == age) {//если возраст паиента совпадает в введенным
                printPatient(patients[i]);//выводим данные пациента в консоль
            }
        }
    }

    public static void printPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            printPatient(patients[i]);//выводим данные текущего пациента в консоль
        }
    }

    public static void printPatient(Patient patient) {
        System.out.println(String.format("Пациент %s - Возраст = %s, Диагноз - %s, Замужем/Женат - %s,Цвет волос - %s,Сумма заработка = %s",
                patient.fullName, patient.age, patient.diagnosis, patient.married, patient.hairColor, patient.salary));
    }
}
