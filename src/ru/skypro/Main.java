package ru.skypro;

public class Main {
//Задача 1
    byte a = 100;
    short b = 200;
    int c = 999;
    long d = 456L;
    float e = 20.09f;
    double f = 1.67e-27;
    char g = 'A';
    boolean h = true;

    public static void main(String[] args) {
//Задача 2
        double firstGuy = 78.2;
        double secondGuy = 82.7;
        double totalWeightOfThose = firstGuy + secondGuy;
        double weightDifferenceOfThose = secondGuy - firstGuy;
        System.out.println("Общий вес бойцов составляет: " + totalWeightOfThose + " кг");
        System.out.println("Разница в весе бойцов составляет: " + weightDifferenceOfThose + " кг");

//Задача 3

        int bananasQuantity = 5;
        int milkQuantity = 200; //мл
        int creamQuantity = 2;
        int eggQuantity = 4;
        int breakfast = bananasQuantity * 80 + milkQuantity / 100 * 105 + creamQuantity * 100 + eggQuantity * 70; //в г
        double breakfastWeightKg = (double) breakfast / 1000; //перевод в кг
        System.out.println("Вес спорт-завтрака составляет: " + breakfastWeightKg + " кг");

//Задача 4

        int shouldLoseWeight = 7 * 1000;
        int firstAttempt = 250;
        int secondAttempt = 500;
        int theAverage = (firstAttempt + secondAttempt) / 2;
        double amountOfDaysViaFirstAttempt = (double) shouldLoseWeight / firstAttempt;
        double amountOfDaysViaSecondAttempt = (double) shouldLoseWeight / secondAttempt;
        double amountOfDaysInAverage = (double) shouldLoseWeight / theAverage;
        System.out.println("В первом случае спортсмену понадобится " + amountOfDaysViaFirstAttempt + " дней, чтобы сбросить 7 кг");
        System.out.println("Во втором случае спортсмену понадобится " + amountOfDaysViaSecondAttempt + " дней, чтобы сбросить 7 кг");
        System.out.println("В среднем спортсмену понадобится " + Math.round(amountOfDaysInAverage) + " дней, чтобы сбросить 7 кг");

//Задача 5

        int mariaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        double increase = 1.1;
        int monthsInYear = 12;

        int mariaSalaryThroughYear = mariaSalary * monthsInYear;
        int denisSalaryThroughYear = denisSalary * monthsInYear;
        int kristinaSalaryThroughYear = kristinaSalary * monthsInYear;

        double mariaIncreasedSalary = mariaSalary * increase;
        double denisIncreasedSalary = denisSalary * increase;
        double kristinaIncreasedSalary = kristinaSalary * increase;

        double mariaIncreasedSalaryThroughYear = mariaIncreasedSalary * monthsInYear;
        double denisIncreasedSalaryThroughYear = denisIncreasedSalary * monthsInYear;
        double kristinaIncreasedSalaryThroughYear = kristinaIncreasedSalary * monthsInYear;

        double mariaDifferenceInSalary = mariaIncreasedSalaryThroughYear - mariaSalaryThroughYear;
        double denisDifferenceInSalary = denisIncreasedSalaryThroughYear - denisSalaryThroughYear;
        double kristinaDifferenceInSalary = kristinaIncreasedSalaryThroughYear - kristinaSalaryThroughYear;

        System.out.println("Мария теперь получает " + Math.round(mariaIncreasedSalary) + "рублей. Годовой доход вырос на " + Math.round(mariaDifferenceInSalary) + " рублей");
        System.out.println("Денис теперь получает " + Math.round(denisIncreasedSalary) + "рублей. Годовой доход вырос на " + Math.round(denisDifferenceInSalary) + " рублей");
        System.out.println("Кристина теперь получает " + Math.round(kristinaIncreasedSalary) + "рублей. Годовой доход вырос на " + Math.round(kristinaDifferenceInSalary) + " рублей");
    }

}
