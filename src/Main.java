public class Main {
    public static void main(String[] args) {
        int price = 20;     // переменная цены
        int rub = 20;       // количество рублей в соотношении рублей к миле
        int miles = 1;      // количество миль в соотношении рублей к миле
        int percent = miles * 100 / rub;    // процент начислениия расчитывается в соотношении рублей к миле
        int bonus = price * percent / 100;  // формула подсчета количества бонусов
        System.out.println("Итоговый бонус составит: " + bonus); //итог
    }
}