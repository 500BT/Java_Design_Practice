package objects;

public class VendingMachine {
	private int insertedMoney;
	private int[] change;
	private String[] drinks;
	private int selectedDrinkNum;
	
	public VendingMachine() {
		this.insertedMoney = 0;
		this.change = new int[2]; // [0]: 500원개수 [1]: 100원개수
		this.drinks = new String[4]; // 좀더 효율적인 방법이 없을까
		drinks[0] = "coke"; // 800원
		drinks[1] = "soda"; // 700원
		drinks[2] = "lion"; // 600원
		drinks[3] = "water"; // 500원
	}
	
	public int getPriceofDrink(int selected) {
		if (selected == 0) return 800;
		if (selected == 1) return 700;
		if (selected == 2) return 600;
		if (selected == 3) return 500;
		else return 0;
	}
	
	public void insertMoney(int money) {
		this.insertedMoney = this.insertedMoney + money;
	}
	
	public void printMoney() {
		System.out.println("현재 입력되어 있는 돈은 총 " + this.insertedMoney + "원");
	}
	
	public void selectDrink(String drink) {
		for (int i = 0; i < 4; ++i) {
			if (drink == drinks[i]) {
				this.selectedDrinkNum = i;
			}
		}
		
		popSelectedDrink();
	}
	
	public void popSelectedDrink() {
		if (this.insertedMoney < this.getPriceofDrink(this.selectedDrinkNum)) {
			System.out.println("입력받은 돈이 부족함.");
			return;
		}
		
		this.insertedMoney = this.insertedMoney - this.getPriceofDrink(this.selectedDrinkNum);
		System.out.println(this.drinks[selectedDrinkNum] + "가 나왔다!");
	}
	
	public int[] returnChange() {
		while (this.insertedMoney / 500 != 0) {
			this.insertedMoney = this.insertedMoney - 500;
			++change[0];
		}
		while (this.insertedMoney / 100 != 0) {
			this.insertedMoney = this.insertedMoney - 100;
			++change[1];
		}
		
		return this.change; // 500원짜리 n개, 100원짜리 m개 반환
	}
}
