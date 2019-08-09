package basket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BasketTest {
	
	private Basket b;
	
	@Test
	public void addToBasket_shouldContainANewProduct() throws Exception {
		b = new Basket();
		
		b.addProduct("Product", 15);
		
		assertTrue(b.contains("Product"));
	}
	
	@Test
	public void addToBasket_shouldIncreaseAmount() throws Exception {
		b = new Basket();
		b.setTotal(6);
		
		b.addProduct("Product", 15);
		
		assertEquals(b.getTotal(), 21);
	}
	
	@Test
	public void addToBasket_shouldContainANewProduct2() throws Exception {
		b = new Basket();
		
		b.addProduct("Product", 25);
		
		assertTrue(b.contains("Product"));
	}
	
	@Test
	public void addToBasket_shouldIncreaseAmount2() throws Exception {
		b = new Basket();
		b.setTotal(7);
		
		b.addProduct("Product", 25);
		
		assertEquals(b.getTotal(), 32);
	}
}
