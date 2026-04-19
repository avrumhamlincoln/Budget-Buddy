public class Transaction implements HasMenu {
	private String date;
	private double amount;
	private String memo;

	public Transaction(String tDate, double tAmount, String tMemo) {
		this.date = tDate;
		this.amount = tAmount;
		this.memo = tMemo;
	}

	public void incomeTrans(PersonalTracker tracker){
		tracker.increaseBalance(this.amount);
	}

	public void expenseTrans(PersonalTracker tracker){
		tracker.decreaseBalance(this.amount);
	}

	public void menu() {
		System.out.println("---Transaction Menu---");
	}

	public void start() {
	}
	
	public void printTransaction() {
		System.out.println("Date: " + this.date + " | Amount: $" + this.amount + " | Memo: " + this.memo);
	}
}

