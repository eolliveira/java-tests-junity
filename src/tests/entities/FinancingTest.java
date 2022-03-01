package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 90);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(90, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			Financing f = new Financing(100000.0, 1000.0, 90);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueValidData() {
		Financing f = new Financing(100000.0, 2000.0, 90);

		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			Financing f = new Financing(100000.0, 1800.0, 90);
			
			f.setTotalAmount(200000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueValidData() {
		Financing f = new Financing(100000.0, 2000.0, 90);

		f.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			Financing f = new Financing(100000.0, 2000.0, 90);
			
			f.setIncome(1500.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueValidData() {
		Financing f = new Financing(100000.0, 2000.0, 90);

		f.setMonths(91);
		
		Assertions.assertEquals(91, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			Financing f = new Financing(100000.0, 2000.0, 90);
			
			f.setMonths(70);
		});
	}
	
	@Test
	public void entryShouldCalculateInputValue() {
		double valorEsperado = 20000.0;
		
		Financing f = new Financing(100000.0, 2000.0, 90);

		double valorObtido = f.entry();
		
		Assertions.assertEquals(valorEsperado, valorObtido);
	}
	
	@Test
	public void quotaShouldCalculateInputValue() {
		double valorEsperado = 888.8888888888889;
		
		Financing f = new Financing(100000.0, 2000.0, 90);

		double valorObtido = f.quota();
		
		Assertions.assertEquals(valorEsperado, valorObtido);
	}

}
