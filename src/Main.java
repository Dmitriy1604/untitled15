
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i + " отсчет нормальный");
            i++;
        }


        for (int d = 10; d >= 0; d--) {
            System.out.println(d + " обратный отсчет");
        }
    }


    public static void task2() {
        int friDay = 5;
        while (friDay < 32) {
            System.out.println("Сегодня пятница," + friDay + "-е число. Необходимо подготовить отчет.");
            friDay += 7;
        }
    }

    public static void task3() {
        int yearStart = 2022;
        int a = yearStart - 200;
        int b = yearStart + 100;
        for (int year = a; year <= b; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }


        }
    }
}