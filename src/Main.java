public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte a = 40;
        System.out.println("Значение переменной " + "a" + " с типом byte равно " + a);
        short b = 2000;
        System.out.println("Значение переменной " + "b" + " с типом short равно " + b);
        int c = 30000;
        System.out.println ("Значение переменной " + "c" + " с типом int равно " + c);
        long d = 2000000;
        System.out.println("Значение переменной " + "d" + " с типом long равно " + d);
        float e = 4.56f;
        System.out.println("Значение переменной " + "e" + " с типом float равно " + e);
        double j = 5.831;
        System.out.println("Значение переменной " + "j" + " с типом double равно " + j);

        float h = 27.12f;
        long m = 987678965549L;
        double y = 2.786;
        int p = 569;
        short n = -159;
        short f = 27897;
        byte g = 67;

        byte lyudmilaStudents = 23;
        byte annaStudents = 27;
        byte catherinaStudents = 30;
        short totalPaper = 480;
        int totalStudents = lyudmilaStudents + annaStudents + catherinaStudents;
        int paperStudents = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги");

        byte bottleMaking = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int bottlePerformance = bottleMaking / 2;
        int result = bottlePerformance * time1;
        System.out.println("За " + time1 + " машина произвела " + result + " штук бутылок");
        int result1 = bottlePerformance * time2;
        System.out.println("За " + time2 + " машина произвела " + result1 + " штук бутылок");
        int result2 = bottlePerformance * time3;
        System.out.println("За " + time3 + " машина произвела " + result2 + " штук бутылок");
        int result3 = bottlePerformance * time4;
        System.out.println("За " + time4 + " машина произвела " + result3 + " штук бутылок");

        byte schoolRenovation = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int needPaint = schoolRenovation / (whitePaint + brownPaint);
        int totalWhite = whitePaint * needPaint;
        int totalBrown = brownPaint * needPaint;
        System.out.println("В школе, где " + needPaint + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски ");

        byte bananas = 5;
        int bananasGrams = 5 * 80;
        int milk = 200;
        int milkGrams = 200 / 100 * 105;
        byte iceCream = 2;
        int iceCreamGrams = 2 * 100;
        byte eggs = 4;
        int eggsGrams = 4 * 70;
        int gramsProducts = bananasGrams + milkGrams + iceCreamGrams + eggsGrams;
        System.out.println("Всего граммов " + gramsProducts);
        double kilogramProducts = gramsProducts / 1000.0;
        System.out.println("Вес в кг спортивного завтрака " + kilogramProducts);

        int resetKg = 7;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int weighCategory = resetKg * 1000;
        int loseMin = weighCategory / weightLoss1;
        int loseMax = weighCategory / weightLoss2;
        int everyDay = (loseMin + loseMax) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм " + loseMin + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм " + loseMax + " дней");
        System.out.println("Потребовалось  в среднем " + everyDay + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        double salaryIncrease = 0.10;
        double newSalaryMasha = salaryMasha * (1 + salaryIncrease);
        double yearlyIncomeMasha = newSalaryMasha * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей");
        System.out.println("Годовой доход вырос на " + yearlyIncomeMasha + " рублей");
        double newSalaryDenis = salaryDenis * (1 + salaryIncrease);
        double yearlyIncomeDenis = newSalaryDenis * 12;
        System.out.println("Новая зарплата Дениса " + newSalaryDenis + " рублей");
        System.out.println("Годовой доход вырос на " + yearlyIncomeDenis + " рублей");
        double newSalaryChristina = salaryChristina * (1 + salaryIncrease);
        double yearlyIncomeChristina = newSalaryChristina * 12;
        System.out.println("Новая зарплата Кристины " + newSalaryChristina + " рублей");
        System.out.println("Годовой доход вырос на " + yearlyIncomeChristina + " рублей");






    }
}

