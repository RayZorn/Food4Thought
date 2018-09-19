package org.mockito.mockito_all;

public class Implementor implements Calculator {
	
	Calculator calculate;



	public void setCalculate(Calculator calculate) {
		this.calculate = calculate;
	}



	public float computeTax(float amount) {
		// TODO Auto-generated method stub
		return 0;
	}



	public double weeklySalary(Employee emp) {		
		return calculate.weeklySalary(emp);
	}



	public double fortnightSalary(double val) {
		return calculate.fortnightSalary(val);
	}



	public double computeKiwiSaver(Employee emp) {
		return calculate.computeKiwiSaver(emp);
	}
	

}
