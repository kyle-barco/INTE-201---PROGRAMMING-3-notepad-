import java.util.Scanner;

public class Siomai {
	public static void main(String args[]) {
		int porkNum, beefNum, shrimpNum, cokeNum, royalNum, spriteNum;
		welcomeMessage();
		
		
		String[] foods = {"PORK SIOMAI (20.00)", "BEEF SIOMAI (25.00)", "SHRIMP SIOMAI (30.00)", "COKE", "ROYAL", "SPRITE"};
		
		for(int i = 0; i < foods.length; i++){
			if (i == 0) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + porkNum);
			} else if (i == 1) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + beefNum);
			}  else if (i == 2) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + shrimpNum);
			} else if (i == 3) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + cokeNum);
			} else if (i == 4) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + royalNum);
			} else if (i == 5) {
				System.out.println("ENTER THE NUMBER OF " + foods[i] + " ORDERED: " + spriteNum);
			} else {
				return;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		porkNum = scan.nextInt();
		beefNum = scan.nextInt();
		shrimpNum = scan.nextInt();
		cokeNum = scan.nextInt();
		royalNum = scan.nextInt();
		spriteNum = scan.nextInt();
		
		
		


		
		//do {
			
		//} while ()
		
	}
	
	// welcome msg
	public static void welcomeMessage(){
		System.out.println("HIJK SIOMAI FOR YOU CART");
		System.out.println("WHAT'S YOUR ORDER MA'AM/SIR....");
	}

	
	// calculation of prices
	public static void calculatePrice() {
		
	}
	
	// displayOutput
	public static void displayOutput(){
		
	}
	
}