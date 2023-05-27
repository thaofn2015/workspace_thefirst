package fan.study.patterns.creational.builder;

import fan.study.patterns.creational.builder.RequestHeaderUtil.RequestHeadersBuilder;

public class Main {

	public static void main (String []args) {
		
		Order order1 = new OrderBuilder().orderFood("Chicken").orderDrink("CoCa").build();
		System.out.println(order1);
		
		Order order2 = new OrderBuilder().orderFood("Duck").orderDrink("Bear").orderOther("other").build();
		System.out.println(order2);
		
		System.out.println(RequestHeaderUtil.getRequestHeader(new RequestHeadersBuilder()
																.setRequestHeader1()
																.setRequestHeader2()
																.setRequestHeaderOther("hello")
																.setRequestHeaderOther("world")
																.build()));

	}
}
