package com.registration.po;

public class Cipher extends User {
	private String donationAmount;
	private String donationReason;
	private String donationBalance;
	public Cipher(){
		
	}
	public String getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(String donationAmount) {
		this.donationAmount = donationAmount;
	}
	public String getDonationReason() {
		return donationReason;
	}
	public void setDonationReason(String donationReason) {
		this.donationReason = donationReason;
	}
	public String getDonationBalance() {
		return donationBalance;
	}
	public void setDonationBalance(String donationBalance) {
		this.donationBalance = donationBalance;
	}
}
