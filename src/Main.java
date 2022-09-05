public class Main {
    public static void main(String[] args) {

        double x = 100.47; // начальный баланс
        double y = 2344.50; // сумма пополнения счёта
        double k;        // сумма бонуса
        double z = x + y; // итоговый баланс

        if (y > 1000) {
                        k = y / 100;
            System.out.println( k + "P Сумма бонуса" );
            System.out.println((z + k) + "P Итоговый баланс" );
        }        else { k = 0;
            System.out.println(k + "P Сумма бонуса");
            System.out.println((z + k) + "P Итоговый баланс");
        }


    }
}