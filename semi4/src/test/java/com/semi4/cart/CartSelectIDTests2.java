package com.semi4.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
class CartSelectIDTests2 {
	@Autowired
	CartBiz biz;
	
	
	@Test
	void contextLoads() {
		CartVO obj;
		
		try {
			obj = new CartVO("id01",30);
			CartVO cart = biz.getcp(obj);
			System.out.println(cart);
			
			System.out.println("Select OK");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
