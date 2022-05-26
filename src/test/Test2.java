package test;

public class Test2 {
    public static void main(String[] args) {
        int amount = 1200;
        System.out.println("Баланс на счете = " + amount);
        int bonus = 0;
        if (amount>1000) {
            bonus = amount/100;
        }

        System.out.println("Количество бонусов " + bonus
        );
    }
}
