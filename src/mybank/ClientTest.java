package mybank;

public class ClientTest {

	public static void main(String[] args) {
				
		
		Account account = new Account();
		
		account.setBalance("6000");
		
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Jack");
		t2.setName("Jill");
		
		t1.start();
		t2.start();
	}
}