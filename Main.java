package com.company;

public class Main {

    private static VendingMachine vendingMachine;


    public static void main(String[] args) {

// talab 1
        vendingMachine = new VendingMachine();

        vendingMachine.addBeverage("Suv", 1000);
        vendingMachine.addBeverage("Gazlangan Suv", 1200);
        vendingMachine.addBeverage("Coca Cola", 3200);
        vendingMachine.addBeverage("Pepsi", 2500);
        vendingMachine.addBeverage("Fanta", 3300);
        vendingMachine.addBeverage("Sharbat", 1500);
        vendingMachine.addBeverage("Ayron", 1100);


        System.out.println(vendingMachine.getPrice("Pepsi"));

// talab 2

        vendingMachine.rechargeCard(1, 2000);
        vendingMachine.rechargeCard(2, 15000);
        vendingMachine.rechargeCard(3, 25000);
        vendingMachine.rechargeCard(1, 2500);


        System.out.println(vendingMachine.getCredit(2));

// talab 3


        vendingMachine.refillColumn(1, "Suv", 5);
        vendingMachine.refillColumn(2, "Coca Cola", 10);
        vendingMachine.refillColumn(3, "Sharbat", 2);
        vendingMachine.refillColumn(4, "Suv", 8);


        System.out.println(vendingMachine.availableCans("Suv"));

// talab 4

        System.out.println(vendingMachine.sell("suv", 1));

    }
}
