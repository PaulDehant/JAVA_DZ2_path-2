public class Main {
    public static void main(String[] args) {

        double balance = 100.47;  // начальный баланс
        double put = 2344.50; // сумма пополнения счёта
        double bonus;           // сумма бонуса
        double sum = balance + put;   // итоговый баланс

        if (put > 1000) {
            bonus = put / 100;
            System.out.println(bonus + "P Сумма бонуса");
            System.out.println((sum + bonus) + "P Итоговый баланс");
        } else {
            bonus = 0;
            System.out.println(bonus + "P Сумма бонуса");
            System.out.println((sum + bonus) + "P Итоговый баланс");
        }


    }
}