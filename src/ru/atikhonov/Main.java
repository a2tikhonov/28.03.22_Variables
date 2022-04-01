package ru.atikhonov;

public class Main {

    public static void main(String[] args) {
    //Задача 1
	/*boolean a = true;
    byte b = 127;
    short c = 32767;
    int d = 1_000_000;
    long e = 250_000_000_000_567L;
    float f = 0.1234567f;
    double g = 2E300;
    char h = 'Ж';*/
    //Задача 2
    float firstBoxerWeight = 78.2f;
    float secondBoxerWeight = 82.7f;
    float totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
    System.out.println("Суммарный вес боксеров " + totalBoxersWeight + " кг");
    float boxersWeightDifference = firstBoxerWeight - secondBoxerWeight;
    System.out.println("Разница между весами бойцов " + Math.abs(boxersWeightDifference) + " кг");
    //Задача 3
    int bananaWeight = 80;
    int glassOfMilkWeight = 105;
    int iceCreamBriquetteWeight = 100;
    int eggWeight = 70;
    float sportyBreakfastWeight = 5*bananaWeight + 2*glassOfMilkWeight + 2*iceCreamBriquetteWeight + 4*eggWeight;
    System.out.println("Вес спорт-завтрака " + sportyBreakfastWeight/1000 + " кг");
    //Задача 4
    int totalLoseWeight = 7000;
    int minDailyWeightLoss = 250;
    int maxDailyWeightLoss = 500;
    int maxProgramDays = totalLoseWeight / minDailyWeightLoss;
    System.out.println(maxProgramDays + " дней уйдет на похудение, если спортсмен будет терять ежедневно 250г");
    int minProgramDays = totalLoseWeight / maxDailyWeightLoss;
    System.out.println(minProgramDays + " дней уйдет на похудение, если спортсмен будет терять ежедневно 500г");
    int avgProgramDays = (minProgramDays + maxProgramDays) / 2;
    System.out.println(avgProgramDays + " дней может потребоваться в среднем для похудения");
    //Задача 5
    int MashasSalary = 67_760;
    int DenisSalary = 83_690;
    int KristinasSalary = 76_230;
    int oldMashasAnnualIncome = MashasSalary * 12;
    MashasSalary += MashasSalary * 0.1;
    int newMashasAnnualIncome = MashasSalary * 12;
    int mashasAnnualIncomeGrowth = newMashasAnnualIncome - oldMashasAnnualIncome;
    System.out.println("Маша теперь получает " + MashasSalary + " рублей. Годовой доход вырос на " + mashasAnnualIncomeGrowth + " рублей");
    int oldDenisAnnualIncome = DenisSalary * 12;
    DenisSalary += DenisSalary * 0.1;
    int newDenisAnnualIncome = DenisSalary * 12;
    int denisAnnualIncomeGrowth = newDenisAnnualIncome - oldDenisAnnualIncome;
    System.out.println("Денис теперь получает " + DenisSalary + " рублей. Годовой доход вырос на " + denisAnnualIncomeGrowth + " рублей");
    int oldKristinasAnnualIncome = KristinasSalary * 12;
    KristinasSalary += KristinasSalary * 0.1;
    int newKristinasAnnualIncome = KristinasSalary * 12;
    int kristinasAnnualIncomeGrowth = newKristinasAnnualIncome - oldKristinasAnnualIncome;
    System.out.println("Кристина теперь получает " + KristinasSalary + " рублей. Годовой доход вырос на " + kristinasAnnualIncomeGrowth + " рублей");
    System.out.println("Дальше идет доп. задание");
    //Задача 6
    int a = 12;
    int b = 27;
    int c = 44;
    int d = 15;
    int e = 9;
    int result = a * (b + (c - d * e));
    System.out.println(-result);
    //Задача 7
    a = 5;
    b = 7;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    //Задача 8
    a = 496;
    b = (a % 100) / 10;
    System.out.println(b);
    }
}
