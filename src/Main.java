public class Main {
    public static void main(String[] args) {

        int amount = 14597; // Сумма покупки
        int money = 20; // Кол-во рублей для начисления одной мили
        int bonus = amount / money * 1; // Формула начисления бонусных миль (за каждые 20р - начисляется 1 миля)
        System.out.println("Итоговые бонусные мили: " + bonus);
    }  }
