package objects;

public class VendingMachine {
	private int insertedMoney;
	private int[] change;
	private String[] drinks;
	private int selectedDrinkNum;
	
	public VendingMachine() {
		this.insertedMoney = 0;
		this.change = new int[2]; // [0]: 500������ [1]: 100������
		this.drinks = new String[4]; // ���� ȿ������ ����� ������
		drinks[0] = "coke"; // 800��
		drinks[1] = "soda"; // 700��
		drinks[2] = "lion"; // 600��
		drinks[3] = "water"; // 500��
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
		System.out.println("���� �ԷµǾ� �ִ� ���� �� " + this.insertedMoney + "��");
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
			System.out.println("�Է¹��� ���� ������.");
			return;
		}
		
		this.insertedMoney = this.insertedMoney - this.getPriceofDrink(this.selectedDrinkNum);
		System.out.println(this.drinks[selectedDrinkNum] + "�� ���Դ�!");
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
		
		return this.change; // 500��¥�� n��, 100��¥�� m�� ��ȯ
	}
}
