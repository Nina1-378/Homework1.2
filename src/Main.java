public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Целочисленные");
        byte b = 120;
        System.out.println("byte = " + b);
        short s = 31_598;
        System.out.println("short = " + s);
        int i = 1_349_425_768;
        System.out.println("int = " + i);
        long l = 1_378L;
        System.out.println("long = " + l);
        System.out.println("С плавающей точкой");
        float f = 0.9135867f;
        System.out.println("float = " + f);
        double d = 213.8589324610787;
        System.out.println("double = " + d);
        System.out.println("Символы");
        char c = 63;
        System.out.println("char = " + c);
        System.out.println("Логические");
        boolean bn = b <= 139;
        System.out.println("boolean = " + bn);

        System.out.println("Задание 2");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float boxersWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + boxersWeight + " кг");
        float differenceBetweenWeight = Math.abs (boxer1 - boxer2);
        System.out.println("Разница между весами бойцов " + differenceBetweenWeight + " кг");

        System.out.println("Задание 3");
        byte bananas = 5;
        byte bananasWeight = 80;
        int totalBananasWeight = bananas * bananasWeight;
        System.out.println("Вес бананов = " + totalBananasWeight + " г");
        short milk = 200;
        short milkWeight = 105;
        int totalMilkWeight = (milk / 100) * milkWeight;
        System.out.println("Вес молока = " + totalMilkWeight + " г");
        byte iceCream = 2;
        short iceCreamWeight = 100;
        int totalIceCreamsWeight = iceCream * iceCreamWeight;
        System.out.println("Вес мороженного = " + totalIceCreamsWeight + " г");
        byte eggs = 4;
        short eggsWeight = 70;
        int totalEggsWeight = eggs * eggsWeight;
        System.out.println("Вес яиц = " + totalEggsWeight + " г");
        int sportsBreakfastTotalWeight = totalBananasWeight + totalMilkWeight + totalIceCreamsWeight + totalEggsWeight;
        System.out.println("Общий вес спорт-завтрака в граммах = " + sportsBreakfastTotalWeight + " г");
        int grInKg = 1_000;
        float sportsBreakfastTotalWeight2 = sportsBreakfastTotalWeight / (float) grInKg;
        System.out.println("Общий вес спорт-завтрака в килограммах = " + sportsBreakfastTotalWeight2 + " кг");

        System.out.println("Задание 4");
        byte needReset = 7;
        int kgInGr = 1_000;
        float weightGr = needReset * (float) kgInGr;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        float daysWeightLoss1 = weightGr / weightLoss1;
        System.out.println("Если спортсмен будет худеть каждый день на 250 г, то чтобы похудеть на 7 кг ему потребуется = " + daysWeightLoss1 + " дн");
        float daysWeightLoss2 = weightGr / weightLoss2;
        System.out.println("Если спортсмен будет худеть каждый день на 500 г, то чтобы похудеть на 7 кг ему потребуется = " + daysWeightLoss2 + " дн");
        float averageDaysWeightLoss = (daysWeightLoss1 + daysWeightLoss2) / 2;
        System.out.println("В среднем, чтобы похудеть на 7 кг спортсмену потребуется = " + averageDaysWeightLoss + " дн");

        System.out.println("Задание 5");
        float salary = 12_127.50f;
        float salaryMasha = 67_760.00f;
        float salaryDenis = 83_690.00f;
        float salaryKristina = 76_230.00f;
        float additionalPayment = 0.1f;
        byte experience = 3;
        float experience1 = 4f;
        float a = salary;
        float y = additionalPayment;
        if (experience1 <= experience) {
            float salary1 = a;
            System.out.println("Зарплата = " + salary1 + " руб.");
        } else if (experience1 > experience) {
            float salary1 = a + (a * y);
            System.out.println("Теперь зарплата = " + salary1 + " руб.");
        }
        if (experience1 <= experience) {
            float salaryMasha1 = salaryMasha;
            float salaryDenis1 = salaryDenis;
            float salaryKristina1 = salaryKristina;
            System.out.println("Зарплата Маши = " + salaryMasha1 + " руб.");
            System.out.println("Зарплата Дениса = " + salaryDenis1 + " руб.");
            System.out.println("Зарплата Кристины = " + salaryKristina1 + " руб.");
        } else if (experience1 > experience) {
            float salaryMasha1 = salaryMasha + (float) (salaryMasha * y);
            float salaryDenis1 = salaryDenis + (float) (salaryDenis * y);
            float salaryKristina1 = salaryKristina + (float) (salaryKristina * y);
            System.out.println("Теперь зарплата Маши = " + salaryMasha1 + " руб.");
            System.out.println("Теперь зарплата Дениса = " + salaryDenis1 + " руб.");
            System.out.println("Теперь зарплата Кристины = " + salaryKristina1 + " руб.");
        }
        float ar = salaryMasha;
        float br = salaryDenis;
        float cr = salaryKristina;
        float totalAnnualIncomeBeforeIncrease = (ar + br + cr) * 12;
        float totalAnnualIncomeAfterIncrease = totalAnnualIncomeBeforeIncrease +
                (totalAnnualIncomeBeforeIncrease * y);
        float differenceBetweenTheAnnualIncome = totalAnnualIncomeAfterIncrease - totalAnnualIncomeBeforeIncrease;
        System.out.println("Общий годовой доход до повышения = " + totalAnnualIncomeBeforeIncrease + " руб.");
        System.out.println("Общий годовой доход после повышения = " + totalAnnualIncomeAfterIncrease + " руб.");
        System.out.println("Разница между годовым доходом на " + differenceBetweenTheAnnualIncome + " руб.");
        float totalAnnualIncomeBeforeIncreaseMasha = ar * 12;
        float totalAnnualIncomeAfterIncreaseMasha = totalAnnualIncomeBeforeIncreaseMasha +
                (totalAnnualIncomeBeforeIncreaseMasha * y);
        float differenceBetweenTheAnnualIncomeMasha = totalAnnualIncomeAfterIncreaseMasha -
                totalAnnualIncomeBeforeIncreaseMasha;
        float totalAnnualIncomeBeforeIncreaseDenis = br * 12;
        float totalAnnualIncomeAfterIncreaseDenis = totalAnnualIncomeBeforeIncreaseDenis +
                (totalAnnualIncomeBeforeIncreaseDenis * y);
        float differenceBetweenTheAnnualIncomeDenis = totalAnnualIncomeAfterIncreaseDenis -
                totalAnnualIncomeBeforeIncreaseDenis;
        float totalAnnualIncomeBeforeIncreaseKristina = cr * 12;
        float totalAnnualIncomeAfterIncreaseKristina = totalAnnualIncomeBeforeIncreaseKristina +
                (totalAnnualIncomeBeforeIncreaseKristina * y);
        float differenceBetweenTheAnnualIncomeKristina = totalAnnualIncomeAfterIncreaseKristina -
                totalAnnualIncomeBeforeIncreaseKristina;
        System.out.println("Теперь годовой доход Маши = " + totalAnnualIncomeAfterIncreaseMasha + " рублей" + "." +
                "Годовой доход вырос на " + differenceBetweenTheAnnualIncomeMasha + "руб.");
        System.out.println("Теперь годовой доход Дениса = " + totalAnnualIncomeAfterIncreaseDenis + " рублей" + "." +
                "Годовой доход вырос на " + differenceBetweenTheAnnualIncomeDenis + "руб.");
        System.out.println("Теперь годовой доход Кристины = " + totalAnnualIncomeAfterIncreaseKristina + " рублей" +
                "." + "Годовой доход вырос на " + differenceBetweenTheAnnualIncomeKristina + "руб.");
    }
}