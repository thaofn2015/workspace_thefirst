package fan.study.patterns.creational.builder;

public class OrderBuilder {
	
	private String orderFood;
	private String orderDrink;
	private String orderOther;
	
	public OrderBuilder orderFood(String food) {
		this.orderFood = food;
		return this;
	}
	
	public OrderBuilder orderDrink(String drink) {
		this.orderDrink = drink;
		return this;
	}
	
	public OrderBuilder orderOther(String other) {
		this.orderOther = other;
		return this;
	}
	
	public Order build() {
		return new Order(orderFood, orderDrink, orderOther);
	}

	
}
