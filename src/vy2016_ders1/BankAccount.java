package vy2016_ders1;

public class BankAccount {
	private double balance;
	
	public BankAccount(double openningBalance){
		this.balance=openningBalance;
	}
	

	public void deposite(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		balance-=amount;
	}
	
	public void display(){
		System.out.printf("Balance =%.2f \n",balance);
	}
}
