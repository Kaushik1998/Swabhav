package com.techlab.account;

public class EmailListener implements Listener {

	private Account user;

	public void setUser(Account user) {
		this.user = user;
	}
	
	@Override
	public void update(AccountTransaction a, double amount) {
		// TODO Auto-generated method stub
		System.out.println("This is Email to " + user.getEmailID());
		System.out.println("Dear " + user + "\nYour Account : " + user.hashCode() + " has been " + a + " by " + amount+ " on " + now);
		System.out.println("Your account balance is : " + user.getBalance());
		System.out.println();
	}

}
