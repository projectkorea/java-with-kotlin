package com.projectkorea.java.step04;

public class main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("money1 is greater than money2");
        } else if (money1.compareTo(money2) < 0) {
            System.out.println("money1 is less than money2");
        } else {
            System.out.println("money1 is equal to money2");
        }
    }
}
