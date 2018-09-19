package org.mockito.mockito_all;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class CalculatorTest {

	// Create obj of interface and class
	Calculator calculator;
	Implementor implementor;

	float amount, income, kiwiOption;
	Employee emp;
	
	double aSalary;

	@Before
	public void setUp() throws Exception {

		 emp = new Employee();
		 aSalary = 100;

		calculator = Mockito.mock(Calculator.class);
		implementor = new Implementor();

		// Mockito.when(calculator.computeTax(amount)).thenReturn(income/3);

		Mockito.when(calculator.fortnightSalary(aSalary/26)).thenReturn(aSalary/26);

		// Mockito.when(calculator.fortnightSalary(income)).thenReturn(income/26);

		// Mockito.when(calculator.weeklySalary(income)).thenReturn(income/52);
		//
		// Mockito.when(calculator.computeKiwiSaver(kiwiOption)).thenReturn((income/100)*4);
		//
		implementor.setCalculate(calculator);

	}

	@After
	public void tearDown() throws Exception {

	}

//	@Test
//	public void testComputeTax() {
//		// assertEquals((x*y), implementationObj.multiply(x, y));
//		assertEquals((income / 3), calculator.computeTax(amount), 0.2);
//	}

	public void testfortnightSalary() {
	assertEquals(aSalary/26, implementor.fortnightSalary(aSalary), 0.2);
		
	}

	// public void testweeklySalary() {
	//assertEquals((emp.salary / 26), implementor.fortnightSalary(emp.salary), 0.2);
	// }
	//
	// public void testkiwiSaverInput() {

	// }

}
