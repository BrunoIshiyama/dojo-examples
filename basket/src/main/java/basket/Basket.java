package basket;

import java.util.HashMap;

public class Basket {
	private HashMap<String, Integer> basket = new HashMap<>();
	private int total = 0;
	
	public void addProduct(String name, Integer value) {
		basket.put(name, value);
		setTotal(getTotal() + value);
	}
	
	public boolean contains(String name) {
		return basket.containsKey(name);
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return this.total;
	}
}
