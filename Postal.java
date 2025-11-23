import javax.swing.*;

public class Postal {
	public static void main(String args[]) {
		do {
			welcomeMsg();
			
		}
		
		while 
	}
	
	public static void welcomeMsg() {
		addressMsg();
		cityChoices();
	}
	
	public static void addressMsg() {
		final String COMPANY_ADDR_LINE_1 = "\t\tHIJK POSTAL SERVICES";
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
	
	public static void computeCharge(double inputNum) {
		double totalCharge;
		final int expressDelivery = 150, MANILA_CHARGE = 175, PASAY_CHARGE = 150, QUEZON_CHARGE = 200, TAGUIG_CHARGE = 250, MAKATI_CHARGE = 275;

		switch (inputNum) {
			case 1: 
				totalCharge = MANILA_CHARGE + expressDelivery;
				break;
			case 2: 
				totalCharge = PASAY_CHARGE + expressDelivery;
				break;
			case 3: 
				totalCharge = QUEZON_CHARGE + expressDelivery;
				break;
			case 4: 
				totalCharge = TAGUIG_CHARGE + expressDelivery;
				break;
			case 5: 
				totalCharge = MAKATI_CHARGE + expressDelivery;
				break;
			default:
				totalCharge = 0;
		}
		
	}
	
	public static void isExpressDelivery(char ans) {
		if (ans == "Y") {
			
		}
	}
	
	
}