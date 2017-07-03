package com.anusha.dto;

public class DashboardDTO {

	private Integer noOfUsers;
	
	public Integer getNoOfUsers() {
		return noOfUsers;
	}

	public void setNoOfUsers(Integer noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public Integer getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(Integer noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	public Long getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(Long totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}

	private Integer noOfOrders;
	
	private Long totalOrderAmount;
	
}
