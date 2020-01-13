package com.bridgelabz.fellowship.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Purpose: To set and get data to available fields
 * 
 * @author 
 *
 */
public class TransactionDetails {

	public String companyName;
	public int noOfCompanyShares;
	public String customerName;
	public int noOfCustomerShares;
	public LocalDateTime datetime;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getNoOfCompanyShares() {
		return noOfCompanyShares;
	}

	public void setNoOfCompanyShares(int noOfCompanyShares) {
		this.noOfCompanyShares = noOfCompanyShares;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getNoOfCustomerShares() {
		return noOfCustomerShares;
	}

	public void setNoOfCustomerShares(int noOfCustomerShares) {
		this.noOfCustomerShares = noOfCustomerShares;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "TransactionDetails [companyName=" + companyName + ", noOfCompanyShares=" + noOfCompanyShares
				+ ", customerName=" + customerName + ", noOfCustomerShares=" + noOfCustomerShares + ", datetime="
				+ datetime + "]";
	}

}
