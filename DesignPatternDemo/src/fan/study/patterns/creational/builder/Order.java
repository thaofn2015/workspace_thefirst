package fan.study.patterns.creational.builder;

public class Order {

	private String orderFood;
	private String orderDrink;
	private String orderOther;

	
	public Order(String orderFood, String orderDrink, String orderOther) {
		super();
		this.orderFood = orderFood;
		this.orderDrink = orderDrink;
		this.orderOther = orderOther;
	}


	public String getOrderFood() {
		return orderFood;
	}


	public void setOrderFood(String orderFood) {
		this.orderFood = orderFood;
	}


	public String getOrderDrink() {
		return orderDrink;
	}


	public void setOrderDrink(String orderDrink) {
		this.orderDrink = orderDrink;
	}


	public String getOrderOther() {
		return orderOther;
	}


	public void setOrderOther(String orderOther) {
		this.orderOther = orderOther;
	}

	public String toString() {
		return "Food: " + orderFood +  " - Drink: " + orderDrink + " - Other: " + orderOther;
	}
}
