package com.app.tollcalculator407;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;

public class TollCalculatorTest {
	// Distance: 67.74799999999999
	// Total cost of the trip: $16.94
	@Test
	public void costTest1() {
		String nameToStart = "QEW";
		String nameToEnd = "Highway 400";
		double expectedCost = 16.94;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.01);
	}

	@Test
	public void costTest2() {
		String nameToStart = "Salem Road";
		String nameToEnd = "QEW";
		double expectedCost = 27.00;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.01);
	}

	@Test
	public void costTest3() {
		String nameToStart = "QEW";
		String nameToEnd = "Salem Road";
		double expectedCost = 28.82;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.01);
	}

	@Test
	public void testCostToTrip1() {
		String nameToStart = "QEW";
		String nameToEnd = "QEW";
		double expectedCost = 0.0;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.0);
	}

	@Test
	public void testCostToTrip2() {
		String nameToStart = "QEW";
		String nameToEnd = "Winston Churchill Blvd";
		double expectedCost = 0.0;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.001);
	}

	@Test
	public void testCostToTrip3() {
		String nameToStart = "Some Nonexistent Location";
		String nameToEnd = "Dundas Street";
		double expectedCost = 0.0;
		assertEquals(expectedCost, TollCalculator.costOfTrip(nameToStart, nameToEnd), 0.0);
	}

	@Test
	public void testOfFindLocationByName() {
		JSONObject locations = new JSONObject();
		JSONObject location1 = new JSONObject();
		location1.put("name", "QEW");
		locations.put("1", location1);

	}

}
