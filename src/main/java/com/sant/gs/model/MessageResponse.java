package com.sant.gs.model;

public class MessageResponse {
	private boolean response;
	private String message;

	public MessageResponse(boolean response, String message) {
		
		this.response = response;
		this.message = message;
	}


	public MessageResponse() {
		// TODO Auto-generated constructor stub
	}


	public boolean isResponse() {
		return response;
	}


	public void setResponse(boolean response) {
		this.response = response;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
