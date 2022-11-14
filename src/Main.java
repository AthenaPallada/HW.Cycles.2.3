public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int startYear = 1822;
        int endYear = 2122;
        for(; startYear <= endYear; startYear++) {
            if(startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }
        // Задача 2
        System.out.println("Задача 2");
        byte a = 2;
        for(int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}