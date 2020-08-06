package com.cg.groceryshop.service;

import java.util.List;

public interface AddtoCartService {

	List<String> forProductStatus(String productId);
	String forProductBooking( String productId, String productName);
}
