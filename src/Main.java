public class Main {
public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();



}
public static void task1() {
        System.out.println("задача 1 ");
  int monthAmount = 15_000;
        int sum = 0;
        int month = 1;
        while(sum < 2_459_00) {
            sum += monthAmount;
            System.out.printf("Месяц %s , сумма накоплений равна %d рублей ", month, sum);
            System.out.println();
            month++;
        }}
    public static void task2() {
        System.out.println("задача 2 ");
         int i = 0;
         while ( i < 10) {
             System.out.print(++i + "");
         }
        System.out.println();
        for ( int j = 10; j > 0; j--) {
            System.out.print(j + "");

        }}
        public static void task3 () {
                System.out.println("задача 3 ");
int population = 12_000_000;
for ( int year = 1 ; year <= 10; year ++) {
    population = population + (population * 17 / 1000) - (population * 8 / 1000);
    System.out.printf( " Год %d, численность населения составляет %d\n",year,population);

}}
    public static void task4 () {
        System.out.println("задача 4");
        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            System.out.println(" Месяц " + month + ", сумма = " + sum);
            month++;

        }
    }public static void task5 () {
            System.out.println("задача 5");
int i = 1;
        while (i < 10) {
            System.out.println(++i + "");

        }


    }public static void task6 () {
        System.out.println("задача 6");
for ( int j = 10 ; j > 0 ; j --) {
    System.out.println(j + "");

}} public static void task7 () {
        System.out.println("задача 7");
double sum = 15_000;
int month = 1;
while (sum < 12_000_000) {
    sum = sum + sum * 0.07;
    System.out.println(" месяц " + month + " сумма = " + sum);
    month++;

}}public static void task8 () {
        System.out.println("задача 8");

        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0)
                System.out.println(" месяц " + month + " сумма = " + sum);
            month++;


        }} public static void task9 () {
                System.out.println("задача 9");
        double sum = 15_000;
        int month = 1;
        while (month < 9*12) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0)
                System.out.println(" месяц " + month + " сумма = " + sum);
            month++;


        }}public static void task10 () {
                System.out.println("задача 10");

         int friday = 5;
         while (friday < 31) {
             System.out.println ( " сегодня пятница" + friday + " -e числоюНеобходимо подготовить отчет");
             friday += 7;
         }
         int start = 2023 - 200;
         int end = 2023 + 100;
         for ( int year = start; year <= end; year ++){
             if ( year % 79 == 0 ){
                 System.out.println(year);


             }
         }

}}