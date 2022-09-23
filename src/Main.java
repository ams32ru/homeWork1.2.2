public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1 и 2");
        int deposit = 15000;
        int mont = 0;
        while (deposit <= 12_000_000){
            int interestRate = deposit/100*7;
            deposit = deposit+interestRate;
            mont++;
            if (mont % 6 ==0) {
                System.out.println("Месяц " + mont + " сумма накоплений равна " + deposit);
            }
        }
        System.out.println("Для того что бы Василий накопил 12 миллионов рублей ему понадобиться " + mont + " месяцев");
        // наверное проще будет не объявять переменную interestRate а просто сделать вычисления в одно действие
        System.out.println("задание 3");
        int depositVasilyi = 15000;
        int montVasilyi = 0;
        while (montVasilyi < 9*12){
            montVasilyi++;
            depositVasilyi = depositVasilyi + depositVasilyi/100*7;
            if (montVasilyi % 6 ==0){
                System.out.println("за " + montVasilyi + " месяцев вклада, Василий накопил " + depositVasilyi + " рублей. ");
            }
        }
        System.out.println("Задание 4");
        int friday = 2;
        for (int i = 1; i <= 31; i++) {
            if (i==friday || i==friday+7 || i == friday+14 || i==friday+21 || i == friday +28){
                System.out.println("Сегодня пятница " + i + " число. Необходимо подготовить отчет.");
            }

        }






    }
}