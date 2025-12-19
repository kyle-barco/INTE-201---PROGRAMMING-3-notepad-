import java.util.Scanner;

public class Siomai {
	public static void main(String args[]) {
		int porkNum = 0, beefNum = 0, shrimpNum = 0, cokeNum = 0, royalNum = 0, spriteNum = 0;
		final double PORK_PRICE = 20.00, BEEF_PRICE = 25.00, SHRIMP_PRICE = 30.00, DRINKS_PRICE = 20.00;
		double grandTotal = 0;
		char isContinue;
		
		do {
			welcomeMessage();
			String[] foods = {"PORK SIOMAI (20.00)", "BEEF SIOMAI (25.00)", "SHRIMP SIOMAI (30.00)", "COKE (20.00)", "ROYAL (20.00) ", "SPRITE (20.00)"};
			
			Scanner scan = new Scanner(System.in);
			
			for(int i = 0; i < foods.length; i++){
				if (i == 0) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] + " ORDERED	 : " );
					porkNum = scan.nextInt();
				} else if (i == 1) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] 	+ " ORDERED	 : " );
					beefNum = scan.nextInt();
				}  else if (i == 2) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " );
					shrimpNum = scan.nextInt();
				} else if (i == 3) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] + " ORDERED	 : " );
					cokeNum = scan.nextInt();
				} else if (i == 4) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] + " ORDERED	 : " );
					royalNum = scan.nextInt();
				} else if (i == 5) {
					System.out.print("ENTER THE NUMBER OF " + foods[i] + " ORDERED	 : " );
					spriteNum = scan.nextInt();
				} else {
					return;
				}
			}
			
			pressToContinue();
			
			double porkAmt = porkNum * PORK_PRICE, beefAmt = beefNum * BEEF_PRICE, shrimpAmt = shrimpNum * SHRIMP_PRICE,
				cokeAmt = cokeNum * DRINKS_PRICE, royalAmt = royalNum * DRINKS_PRICE, spriteAmt = spriteNum * DRINKS_PRICE, totalAmt;
				
			totalAmt = porkAmt + beefAmt + shrimpAmt + cokeAmt + royalAmt + spriteAmt;
			
			System.out.print("\n\n\t\tHIJK SIOMAI LOVE FOOD CART\n");
			System.out.print("************************************************************************\n");
			System.out.print("PARTICULARS			QUANTITY			AMOUNT\n");
			System.out.print("\nPORK" + "				" + porkNum + "				" + porkAmt);
			System.out.print("\nBEEF" + "				" + beefNum + "				" + beefAmt);
			System.out.print("\nSHRIMP" + "				" + shrimpNum + "				" + shrimpAmt);
			System.out.print("\nCOKE" + "				" + cokeNum + "				" + cokeAmt);
			System.out.print("\nROYAL" + "				" + royalNum + "				" + royalAmt);
			System.out.print("\nSPRITE" + "				" + spriteNum + "				" + spriteAmt);
			System.out.print("\n\t\tTOTAL" + "						 " + totalAmt );
			
			
			System.out.print("\n\nDo you want to continue? (y/n): ");
			isContinue = scan.next().charAt(0);
			grandTotal += totalAmt;
		}

		while (isContinue == 'Y' || isContinue == 'y');
		displayOutput(grandTotal);
		
	}
	
	public static void pressToContinue(){
		System.out.println("Press any key to continue...");
			try {
				while (System.in.available() > 0) {
					System.in.read();
				}
			System.in.read();
			  }
			catch (Exception e){
				e.printStackTrace();
			}
	}
	
	// welcome msg
	public static void welcomeMessage(){
		System.out.println("\nHIJK SIOMAI FOR YOU CART");
		System.out.println("WHAT'S YOUR ORDER MA'AM/SIR....");
	}
	
	
	// displayOutput
	public static void displayOutput(double grandTotal){
		System.out.println("\nGRAND TOTAL: " + grandTotal);
		System.out.println("PROGRAMMED BY : KYLE BARCO");
	}
	
}