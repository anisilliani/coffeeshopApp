package coffeeVendingMachine;

import java.util.Scanner;

public class CoffeeVendingMachineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeVendingMachineIfce machine = new CoffeeVendingMachine();
		Scanner sc = new Scanner(System.in);		
		int coffeeType;
		int sizeCoffee;
		int topping=0;
		
		System.out.println("Choose which type of coffee do you want?");
		System.out.println("[1] DarkRoast");
		System.out.println("[2] Espresso");
		System.out.println("[3] House of blend");
		coffeeType = sc.nextInt();
		
		switch (coffeeType) {
		case 1:
			machine.setCoffee("DARKROAST");
			break;
		case 2:
			machine.setCoffee("ESPRESSO");
			break;
		case 3:
			machine.setCoffee("HOUSE OF BLEND");
			break;
		default:
			break;
		}
		
		System.out.println("Please choose size od coffee");
		System.out.println("[1] TALL");
		System.out.println("[2] GRANDE");
		System.out.println("[3] VENTI");
		sizeCoffee = sc.nextInt();
		
		switch (sizeCoffee) {
		case 1:
			machine.setSize("TALL");
			break;
		case 2:
			machine.setCoffee("GRANDE");
			break;
		case 3:
			machine.setCoffee("VENTI");
			break;
		default:
			break;
		}
		
		while(topping!=5) {
		System.out.println("Choose topping do you want");
		System.out.println("[1] Milk");
		System.out.println("[2] Soy");
		System.out.println("[3] Mocha");
		System.out.println("[4] Whip");
		System.out.println("[5] Place Order");
		
		topping = sc.nextInt();
		
		switch (topping) {
		case 1:
			machine.addTopping("MILK");
			break;
		case 2:
			machine.addTopping("SOY");
			break;
		case 3:
			machine.addTopping("MOCHA");
			break;
		case 4:
			machine.addTopping("WHIP");
			break;
		case 5:
			machine.placeOrder();
			break;
		default:
			break;
		}
		
		
		}
		
	}
}
