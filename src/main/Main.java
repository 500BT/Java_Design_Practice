package main;

import objects.VendingMachine;

public class Main {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		int[] numCoins = { 0, 0 };
		
		machine.insertMoney(2000);
		machine.printMoney();
		
		machine.selectDrink("coke");
		numCoins = machine.returnChange();
		
		System.out.println("500원 " + numCoins[0] + "개, 100원 " + numCoins[1] + "개 있음");
		machine.printMoney();
	}
}
