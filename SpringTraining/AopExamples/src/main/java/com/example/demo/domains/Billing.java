package com.example.demo.domains;

import com.example.demo.ifaces.DiscountService;
import com.example.demo.utils.ShowExecutionTime;

public class Billing implements DiscountService {

	@Override
	@ShowExecutionTime
	public double cashDiscount() {	
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0.10;
	}

	@Override
	public String[] getCoupons() {
		return new String[] {"Shopper stop", "Pizzahut", "Tatasky"};
	}

}
