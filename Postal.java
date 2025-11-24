import javax.swing.*;
import java.util.Scanner;

public class Postal {
	public static void main(String args[]) {
		String userInputStr;
		int userInputNum, transaction = 0;
		char isExpressDelivery, ans;
		double totalCharge = 0, totalCollection = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			welcomeMsg();
			userInputStr = JOptionPane.showInputDialog("Cities: ");
			userInputNum = Integer.parseInt(userInputStr);
			System.out.print("You choose city number: " + userInputStr);
			
			
			System.out.print("\nEXPRESS DELIVERY? (Y/N): ");
			isExpressDelivery = scan.next().charAt(0);
			totalCharge = computeCityCharge(userInputNum, isExpressDelivery);
			totalCollection += totalCharge;
			transaction++;


			System.out.print("PROCESS ANOTHER? (Y/N) : ");
			ans = scan.next().charAt(0);
			
		}
		
		while (ans == 'Y' || ans == 'y');
		System.out.print("\nTOTAL COLLECTION FOR THE DAY: " + totalCollection);
		System.out.print("\nTOTAL NO. OF TRANSACTION    : " + transaction);
		System.out.print("\nYOUR NAME                   : BARCO, JAZTHER KYLE D.");
		
	}
	
	public static void welcomeMsg() {
		addressMsg();
		cityChoices();
	}
	
	public static void addressMsg() {
		final String COMPANY_ADDR_LINE_1 = "\n\t\tHIJK POSTAL SERVICES";
		final String COMPANY_ADDR_LINE_2 = "\t\tROXAS BOULEVARD, MANILA\n";
		
		System.out.println(COMPANY_ADDR_LINE_1);
		System.out.println(COMPANY_ADDR_LINE_2);
	}
	
	public static void cityChoices() {
		final String CITIES_CHARGES = "CITIES: \t\t CHARGES: ";
		String[] cities =  {"MANILA", "PASAY\t", "QUEZON", "TAGUIG", "MAKATI"};
		String[] charges =  {"175", "150", "200", "250", "275"};
		
		
		System.out.println(CITIES_CHARGES);
		for(int i = 0; i < cities.length; i++) {
			System.out.println("\t" + (i+1) + " " + cities[i] + "\t " + charges[i]);
		}
	}
	
	public static double computeCityCharge(int inputNum, char isExDel) {
		final int expressDelivery = 150, MANILA_CHARGE = 175, PASAY_CHARGE = 150, QUEZON_CHARGE = 200, TAGUIG_CHARGE = 250, MAKATI_CHARGE = 275;
		double charge = 0;
		
		switch (inputNum) {
				case 1: 
					charge = MANILA_CHARGE ;
					break;
				case 2: 
					charge = PASAY_CHARGE ;
					break;
				case 3: 
					charge = QUEZON_CHARGE;
					break;
				case 4: 
					charge = TAGUIG_CHARGE ;
					break;
				case 5: 
					charge = MAKATI_CHARGE ;
					break;
				default:
					System.out.print("Enter valid number");
			}
		
		if (isExDel == 'y' || isExDel == 'Y') {
			charge += expressDelivery;
		} 
		
		return charge;
	}
}