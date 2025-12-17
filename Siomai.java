import java.util.Scanner;

public class Siomai {
	public static void main(String args[]) {
		int porkNum, beefNum, shrimpNum, cokeNum, royalNum, spriteNum;
		welcomeMessage();
		
		Scanner scan = new Scanner(System.in);
		porkNum = scan.nextInt();
		beefNum = scan.nextInt();
		shrimpNum = scan.nextInt();
		cokeNum = scan.nextInt();
		royalNum = scan.nextInt();
		spriteNum = scan.nextInt();
		
		//userInput(porkNum, beefNum, shrimpNum, cokeNum, royalNum, spriteNum);
	}
	
	// welcome msg
	public static void welcomeMessage(){
		System.out.println("HIJK SIOMAI FOR YOU CART");
		System.out.println("WHAT'S YOUR ORDER MA'AM/SIR....");
	}
	// arr of food choices
	public static int foodChoices(int quantity){
		String[] siomai = {"PORK SIOMAI (20.00)", "BEEF SIOMAI (25.00)", "SHRIMP SIOMAI (30.00)"};
		String[] drinks = {"COKE", "ROYAL", "SPRITE"};
		
		for(int i = 0; i < siomai.length; i++){
			System.out.println("ENTER THE NUMBER OF " + siomai[i] + " ORDERED: " + quantity);
		}
		
		return 0;	
	}
	
	// user inputs
	public static int[] userInput(int porkQty, int beefQty, int shrimpQty, int cokeQty, int royalQty, int spriteQty){
		int pork = foodChoices(porkQty);
		int beef = foodChoices(beefQty);
		int shrimp = foodChoices(shrimpQty);
		int coke = foodChoices(cokeQty);
		int royal = foodChoices(cokeQty);
		int sprite = foodChoices(spriteQty);
		
		return new int[] {pork, beef, shrimp, coke, royal, sprite};
	}
	
	// calculation of prices
	public static void calculatePrice() {
		
	}
	
	// displayOutput
	public static void displayOutput(){
		
	}
	
}