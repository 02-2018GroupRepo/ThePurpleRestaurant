package com.company;


public class Main {

    public static void main(String[] args) {

       Waiter w = new Waiter(20);
        w.displayBillBeforeTip();
        w.addTipToTotal(5);
        System.out.println("You added a tip of $" + w.getTipAmount());
        w.payBill(40);
        System.out.println(w.toString());

        Cashier c = new Cashier(10.00, 12.00);
        System.out.println(c.toString());

    }
}
