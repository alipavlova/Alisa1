package test;

public class Test1 {
    public static void main(String[] args) {
        int amount = 89;
        System.out.println("стоимость билета = " + amount);
        int mili = 20;
        System.out.println("за каждые " +
                mili +
                " рублей 1 миля");
        System.out.println("всего бонусных миль" + amount / mili
        );
    }
}
