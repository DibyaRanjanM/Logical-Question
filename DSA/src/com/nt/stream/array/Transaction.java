package com.nt.stream.array;

public class Transaction {
	String date;
	long amount;

	public Transaction(String date, long amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}
