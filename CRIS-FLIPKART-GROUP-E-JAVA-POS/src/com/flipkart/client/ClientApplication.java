package com.flipkart.client;

import com.flipkart.business.*;

public class ClientApplication {
	public static void main(String[] args) {
		AdminOperations business=new AdminOperations();
		business.removeProf("");
		business.removeCourse("");
	}
}
