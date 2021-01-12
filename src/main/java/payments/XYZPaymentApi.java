package payments;

public interface XYZPaymentApi {
	
	
	//2 different teams can work on deposit and withdraw//
	void deposit(Float amount, String accountID, String signature);
	
	void withdraw(Float amount, String accountID, String signature);

}
