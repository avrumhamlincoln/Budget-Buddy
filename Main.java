public class Main{
	public static void main(String[] args) {
		PersonalTracker tracker;
		tracker = new PersonalTracker();
		tracker.setBalanceGoal(2000.00);
		
		Transaction t1;
        	t1 = new Transaction("04/19/2026", 2500.0, "Paycheck");
        	t1.incomeTrans(tracker);
        	tracker.storeTransaction(t1);

		Transaction t2;
        	t2 = new Transaction("04/20/2026", 800.0, "Rent");
        	t2.expenseTrans(tracker);
        	tracker.storeTransaction(t2);

		tracker.getTransactions();
	}
}
