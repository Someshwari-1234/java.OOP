package practice;

import java.util.Scanner;

class BankAccount {

	private String name;
	private String bankName;
	private long phno;
	private String ifsc;
	private double balance;
	private long accno;
	private String address;
	private long aadhar;
	private int pin;
	private String branch;

	BankAccount() {

	}

	BankAccount(String name, String bankName, long phno, String ifsc, double balance, long accno, String address,
			long aadhar, int pin, String branch) {
		super();
		this.name = name;
		this.bankName = bankName;
		this.phno = phno;
		this.ifsc = ifsc;
		this.balance = balance;
		this.address = address;
		this.aadhar = aadhar;
		this.pin = pin;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public String getBankName() {
		return bankName;
	}

	public Long getPhno() {
		return phno;
	}

	public String getIFSC() {
		return ifsc;
	}

	public void setPin(long accno, int oldpin) {
		if (this.accno == accno && this.pin == oldpin) {
			System.out.println("Account is logged in successfully");
		} else if ((this.accno == accno) && !(this.pin == oldpin)) {
			System.out.println("enter new password");
			Scanner sc = new Scanner(System.in);
			int newPin = sc.nextInt();
			System.out.println("new pass word updated");
		} else {
			System.out.println("account doesnot exists");
		}
	}

	public double getBalance(long accno, int pin) {
		if (this.accno == accno && this.pin == pin) {
			return balance;
		}
		System.out.println("the account is inavlid");
		return 0;
	}

	public long getAadhar() {
		return aadhar;
	}

	public String getAdress() {
		return address;
	}

	public String getBranch() {
		return branch;
	}

	public String toString() {
		return "[" + "name" + name + "  bankName" + bankName + " phno" + phno + " ifsc" + ifsc + " balance" + balance
				+ " accno" + accno + " address" + address + " aadhar" + aadhar + " pin" + pin + " branch" + branch
				+ "]";
	}
}
package practice;

public class BankAccountDriver {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("Someshwari", "SBIbank", 872046635, "rdhghiuhuftdr", 40.00, 2456778, "BK",
				5467867, 1234, "SBI");
		b1.setPin(5453423, 46567);
		b1.getPhno();
		System.out.println(b1);
	}
}
