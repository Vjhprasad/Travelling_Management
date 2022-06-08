package com.Reservation;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class bookingTest {

	@Test
	public void test() {
		booking bk = new booking();
	
		try {
		String	b1 = bk.admin();
		
			assertEquals(b1,"success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
