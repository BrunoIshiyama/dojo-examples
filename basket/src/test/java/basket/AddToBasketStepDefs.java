package basket;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToBasketStepDefs {
	
	private Integer price;
	String product_name;
	private Basket b;
	
	@Before
	public void setup() {
		b = new Basket();
	}
	
	@Given("a product is priced at {string}")
	public void a_product_is_priced_at(String string) {
		product_name = "Product";
	    price = new Integer(string);
	}

	@Given("the basket total is {string}")
	public void the_basket_total_is(String string) {
	    b.setTotal(new Integer(string));
	}

	@When("I add it to the basket")
	public void i_add_it_to_the_basket() {
	    b.addProduct(product_name, price);
	}

	@Then("the total basket price should be {string}")
	public void the_total_basket_price_should_be(String string) {
	    assertEquals(new Integer(string), new Integer(b.getTotal()));
	}
}
